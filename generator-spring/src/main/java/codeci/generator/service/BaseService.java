package codeci.generator.service;

import codeci.generator.config.ConfigBeanValue;
import codeci.generator.constant.JdbcType;
import codeci.generator.constant.ReplaceConstant;
import codeci.generator.dao.entity.Columns;
import codeci.generator.dao.mapper.BaseMapper;
import codeci.generator.dto.ColumnReplaceDto;
import com.fasterxml.jackson.databind.JavaType;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: gjc
 * @time: 2020/4/15 22:35
 * @version: 2.0
 */
@Service
public class BaseService {

    @Resource
    ConfigBeanValue configBeanValue;
    @Resource
    BaseMapper baseMapper;

    @PostConstruct
    public void start() throws Exception {
        // 获取数据库的表
        String tables = configBeanValue.getTables();
        if (StringUtils.isBlank(tables)){
            throw new Exception("需求表(tables)缺失");
        }
        String[] tableArray = tables.split(ReplaceConstant.COMMA);
        for(String table:tableArray){
            getTableResults(table);
        }

        // 新增包

        // 模板替换
    }

    /**
     * 数据库列属性对象转换成模板替换对象
     * @author gcme
     * @version v1.0 (2020/6/3 22:30)
     * @param tableName 数据库表名称
     * @return java.util.List<codeci.generator.dto.ColumnReplaceDto>
     **/
    private List<ColumnReplaceDto> getTableResults(String tableName){
        List<Columns> columnsList = baseMapper.findTableInfo(tableName);
        List<ColumnReplaceDto> replaceDtos = new ArrayList<>();
        for(Columns columns : columnsList){
            ColumnReplaceDto columnReplaceDto = new ColumnReplaceDto();
            String columnName = columns.getColumnName();
            StringBuilder lowerColumn = new StringBuilder();
            StringBuilder upperColumn = new StringBuilder();
            String[] columnNames = columnName.split(ReplaceConstant.UNDER_LINE);
            for(int i=0,size=columnNames.length;i<size;i++){
                String name = columnNames[i];
                String firstUpper = firstToUpper(name);
                if (i == 0) {
                    lowerColumn.append(name);
                }else{
                    lowerColumn.append(firstUpper);
                }
                upperColumn.append(firstUpper);
            }

            String sqlType = columns.getDataType();
            // mysql的基础数据类型映射到jdbcType数据类型
            JdbcType javaType = JdbcType.forCode(sqlType.toUpperCase());
            String jdbcTypeCode = javaType.name();
            // jdbc数据类型映射到java的数据类型
            columnReplaceDto.setSqlColumn(columnName);
            columnReplaceDto.setLowerColumn(lowerColumn.toString());
            columnReplaceDto.setUpperColumn(upperColumn.toString());
            columnReplaceDto.setComment(columns.getColumnComment());
            columnReplaceDto.setJdbcType(jdbcTypeCode);
        }
        return replaceDtos;
    }

    /**
     * 首字母转换成大写
     * @author gcme
     * @version v1.0 (2020/6/3 22:39)
     * @param name
     * @return java.lang.String
     **/
    private String firstToUpper(String name){
        char[] chars = name.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
