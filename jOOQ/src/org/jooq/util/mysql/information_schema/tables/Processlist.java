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
public class Processlist extends TableImpl {

	private static final long serialVersionUID = 6397764040671812160L;

	/**
	 * The singleton instance of PROCESSLIST
	 */
	public static final Processlist PROCESSLIST = new Processlist();

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER = new TableFieldImpl<String>("USER", String.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> HOST = new TableFieldImpl<String>("HOST", String.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DB = new TableFieldImpl<String>("DB", String.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COMMAND = new TableFieldImpl<String>("COMMAND", String.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> TIME = new TableFieldImpl<Integer>("TIME", Integer.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> STATE = new TableFieldImpl<String>("STATE", String.class, PROCESSLIST);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> INFO = new TableFieldImpl<String>("INFO", String.class, PROCESSLIST);

	/**
	 * No further instances allowed
	 */
	private Processlist() {
		super("PROCESSLIST", "information_schema");
	}
}
