/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXTestCase_71 extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	public void setId(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	public java.math.BigDecimal getId();

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public void setTestCase_64_69Id(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public java.math.BigDecimal getTestCase_64_69Id();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_71 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_71> E into(E into);
}
