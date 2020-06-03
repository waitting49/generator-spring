package codeci.generator.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * jdbc的基础数据类型
 * @author gcme
 * @version v1.0 (2020/6/3 22:08)
 **/
public enum JdbcType {
    BIGINT(Types.BIGINT.name()),
    BIT(Types.BIT.name()),
    BLOB(Types.BLOB.name()),
    CHAR(Types.CHAR.name()),
    CLOB(Types.TEXT.name()),
    DATE(Types.DATE.name()),
    DECIMAL(Types.DECIMAL.name()),
    DOUBLE(Types.DOUBLE.name()),
    FLOAT(Types.FLOAT.name()),
    INTEGER(Types.INTEGER.name()),
    NUMERIC(Types.NUMERIC.name()),
    SMALLINT(Types.SMALLINT.name()),
    TIME(Types.TIME.name()),
    TIMESTAMP(Types.TIMESTAMP.name()),
    DATETIME(Types.DATETIME.name()),
    TINYINT(Types.TINYINT.name()),
    VARCHAR(Types.VARCHAR.name());

    private String code;
    private static Map<String,JdbcType> codeLookup = new HashMap<>();

    static {
        for (JdbcType type : JdbcType.values()) {
            codeLookup.put(type.code, type);
        }
    }

    JdbcType(String code) {
        this.code = code;
    }

    public static JdbcType forCode(String code)  {
        return codeLookup.get(code);
    }
}
