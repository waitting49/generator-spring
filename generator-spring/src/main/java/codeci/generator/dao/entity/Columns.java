package codeci.generator.dao.entity;

import java.io.Serializable;

public class Columns implements Serializable {
	private static final long serialVersionUID = 1L;
	/* 
	 * cloumn:TABLE_CATALOG 
	 *  
	 */
	private String tableCatalog;
	/* 
	 * cloumn:TABLE_SCHEMA 
	 *  
	 */
	private String tableSchema;
	/* 
	 * cloumn:TABLE_NAME 
	 *  
	 */
	private String tableName;
	/* 
	 * cloumn:COLUMN_NAME 
	 *  
	 */
	private String columnName;
	/* 
	 * cloumn:ORDINAL_POSITION 
	 *  
	 */
	private Long ordinalPosition;
	/* 
	 * cloumn:COLUMN_DEFAULT 
	 *  
	 */
	private String columnDefault;
	/* 
	 * cloumn:IS_NULLABLE 
	 *  
	 */
	private String isNullable;
	/* 
	 * cloumn:DATA_TYPE 
	 *  
	 */
	private String dataType;
	/* 
	 * cloumn:CHARACTER_MAXIMUM_LENGTH 
	 *  
	 */
	private Long characterMaximumLength;
	/* 
	 * cloumn:CHARACTER_OCTET_LENGTH 
	 *  
	 */
	private Long characterOctetLength;
	/* 
	 * cloumn:NUMERIC_PRECISION 
	 *  
	 */
	private Long numericPrecision;
	/* 
	 * cloumn:NUMERIC_SCALE 
	 *  
	 */
	private Long numericScale;
	/* 
	 * cloumn:CHARACTER_SET_NAME 
	 *  
	 */
	private String characterSetname;
	/* 
	 * cloumn:COLLATION_NAME 
	 *  
	 */
	private String collationName;
	/* 
	 * cloumn:COLUMN_TYPE 
	 *  
	 */
	private String columnType;
	/* 
	 * cloumn:COLUMN_KEY 
	 *  
	 */
	private String columnKey;
	/* 
	 * cloumn:EXTRA 
	 *  
	 */
	private String extra;
	/* 
	 * cloumn:PRIVILEGES 
	 *  
	 */
	private String privileges;
	/* 
	 * cloumn:COLUMN_COMMENT 
	 *  
	 */
	private String columnComment;
	public String getTableCatalog() {
		return tableCatalog;
	}
	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}
	public String getTableSchema() {
		return tableSchema;
	}
	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Long getOrdinalPosition() {
		return ordinalPosition;
	}
	public void setOrdinalPosition(Long ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	public String getColumnDefault() {
		return columnDefault;
	}
	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}
	public String getIsNullable() {
		return isNullable;
	}
	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Long getCharacterMaximumLength() {
		return characterMaximumLength;
	}
	public void setCharacterMaximumLength(Long characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}
	public Long getCharacterOctetLength() {
		return characterOctetLength;
	}
	public void setCharacterOctetLength(Long characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}
	public Long getNumericPrecision() {
		return numericPrecision;
	}
	public void setNumericPrecision(Long numericPrecision) {
		this.numericPrecision = numericPrecision;
	}
	public Long getNumericScale() {
		return numericScale;
	}
	public void setNumericScale(Long numericScale) {
		this.numericScale = numericScale;
	}
	public String getCharacterSetname() {
		return characterSetname;
	}
	public void setCharacterSetname(String characterSetname) {
		this.characterSetname = characterSetname;
	}
	public String getCollationName() {
		return collationName;
	}
	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	public String getColumnKey() {
		return columnKey;
	}
	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getPrivileges() {
		return privileges;
	}
	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}
	public String getColumnComment() {
		return columnComment;
	}
	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}
}