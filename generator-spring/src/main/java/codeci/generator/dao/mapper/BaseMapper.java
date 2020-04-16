package codeci.generator.dao.mapper;

import codeci.generator.dao.entity.Columns;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BaseMapper {

@Select("SELECT  * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = #{tableName} ORDER BY ORDINAL_POSITION")
@Results(
{
@Result(property="columnName",column="COLUMNNAME"),
@Result(property="tableCatalog",column="TABLECATALOG"),
@Result(property="tableSchema",column="TABLESCHEMA"),
@Result(property="tableName",column="TABLENAME"),
@Result(property="ordinalPosition",column="ORDINALPOSITION"),
@Result(property="columnDefault",column="COLUMNDEFAULT"),
@Result(property="isNullable",column="ISNULLABLE"),
@Result(property="dataType",column="DATATYPE"),
@Result(property="characterMaximumLength",column="CHARACTERMAXIMUMLENGTH"),
@Result(property="characterOctetLength",column="CHARACTEROCTETLENGTH"),
@Result(property="numericPrecision",column="NUMERICPRECISION"),
@Result(property="numericScale",column="NUMERICSCALE"),
@Result(property="characterSetname",column="CHARACTERSETNAME"),
@Result(property="collationName",column="COLLATIONNAME"),
@Result(property="columnType",column="COLUMNTYPE"),
@Result(property="columnKey",column="COLUMNKEY"),
@Result(property="extra",column="EXTRA"),
@Result(property="privileges",column="PRIVILEGES"),
@Result(property="columnComment",column="COLUMNCOMMENT"),
}
)
public List<Columns> findTableInfo(String tableName);
}
