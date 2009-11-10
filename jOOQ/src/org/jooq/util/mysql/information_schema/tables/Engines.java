/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
public class Engines extends TableImpl {

	private static final long serialVersionUID = 2830280635587059994L;

	/**
	 * The singleton instance of ENGINES
	 */
	public static final Engines ENGINES = new Engines();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ENGINE = new TableFieldImpl<String>("ENGINE", String.class, ENGINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SUPPORT = new TableFieldImpl<String>("SUPPORT", String.class, ENGINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COMMENT = new TableFieldImpl<String>("COMMENT", String.class, ENGINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TRANSACTIONS = new TableFieldImpl<String>("TRANSACTIONS", String.class, ENGINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> XA = new TableFieldImpl<String>("XA", String.class, ENGINES);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SAVEPOINTS = new TableFieldImpl<String>("SAVEPOINTS", String.class, ENGINES);

	/**
	 * No further instances allowed
	 */
	private Engines() {
		super("ENGINES", "information_schema");
	}
}
