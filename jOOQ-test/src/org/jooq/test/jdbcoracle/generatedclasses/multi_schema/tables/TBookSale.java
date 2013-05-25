/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookSale extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> {

	private static final long serialVersionUID = -1504297883;

	/**
	 * The singleton instance of <code>MULTI_SCHEMA.T_BOOK_SALE</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale T_BOOK_SALE = new org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord.class;
	}

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.math.BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC, T_BOOK_SALE);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.math.BigDecimal> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.NUMERIC, T_BOOK_SALE);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_SALE);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.sql.Date> SOLD_AT = createField("SOLD_AT", org.jooq.impl.SQLDataType.DATE, T_BOOK_SALE);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, java.math.BigDecimal> SOLD_FOR = createField("SOLD_FOR", org.jooq.impl.SQLDataType.NUMERIC, T_BOOK_SALE);

	/**
	 * No further instances allowed
	 */
	private TBookSale() {
		super("T_BOOK_SALE", org.jooq.test.jdbcoracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA);
	}
}
