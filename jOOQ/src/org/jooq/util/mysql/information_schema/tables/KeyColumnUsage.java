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
public class KeyColumnUsage extends TableImpl {

	private static final long serialVersionUID = -2968784996206438015L;

	/**
	 * The singleton instance of KEY_COLUMN_USAGE
	 */
	public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_CATALOG = new TableFieldImpl<String>("CONSTRAINT_CATALOG", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_SCHEMA = new TableFieldImpl<String>("CONSTRAINT_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_NAME = new TableFieldImpl<String>("CONSTRAINT_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_NAME = new TableFieldImpl<String>("COLUMN_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> ORDINAL_POSITION = new TableFieldImpl<Integer>("ORDINAL_POSITION", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> POSITION_IN_UNIQUE_CONSTRAINT = new TableFieldImpl<Integer>("POSITION_IN_UNIQUE_CONSTRAINT", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> REFERENCED_TABLE_SCHEMA = new TableFieldImpl<String>("REFERENCED_TABLE_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> REFERENCED_TABLE_NAME = new TableFieldImpl<String>("REFERENCED_TABLE_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> REFERENCED_COLUMN_NAME = new TableFieldImpl<String>("REFERENCED_COLUMN_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * No further instances allowed
	 */
	private KeyColumnUsage() {
		super("KEY_COLUMN_USAGE", "information_schema");
	}
}
