package codeci.generator.service;

import codeci.generator.config.ConfigBeanValue;
import codeci.generator.dao.entity.Columns;
import codeci.generator.dao.mapper.BaseMapper;
import codeci.generator.dto.ColumnReplaceDto;
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
        String[] tableArray = tables.split(",");
        for(String table:tableArray){
            getTableResults(table);
        }

        // 新增包

        // 模板替换
    }

    /**
     * 获取表的属性值
     * @param tableName
     * @return
     */
    private List<ColumnReplaceDto> getTableResults(String tableName){
        List<Columns> columnsList = baseMapper.findTableInfo(tableName);
        List<ColumnReplaceDto> replaceDtos = new ArrayList<>();
        if (columnsList.size() > 0){
            for(Columns columns : columnsList){
                ColumnReplaceDto columnReplaceDto = new ColumnReplaceDto();
            }
        }
        return replaceDtos;
    }

}
