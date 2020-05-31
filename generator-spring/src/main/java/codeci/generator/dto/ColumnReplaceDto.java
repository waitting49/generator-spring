package codeci.generator.dto;

public class ColumnReplaceDto {
    /**sql里面的属性字段（例：user_name）**/
    private String sqlColumn;
    /**java对象字段（例：UserName）**/
    private String upperColumn;
    /**参数字段（例：userName）**/
    private String lowerColumn;
    /**jdbc数据类型**/
    private String jdbcType;
    /**java数据类型**/
    private String javaType;
    /**属性字段的注释**/
    private String comment;


    public String getSqlColumn() {
        return sqlColumn;
    }

    public void setSqlColumn(String sqlColumn) {
        this.sqlColumn = sqlColumn;
    }

    public String getUpperColumn() {
        return upperColumn;
    }

    public void setUpperColumn(String upperColumn) {
        this.upperColumn = upperColumn;
    }

    public String getLowerColumn() {
        return lowerColumn;
    }

    public void setLowerColumn(String lowerColumn) {
        this.lowerColumn = lowerColumn;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
