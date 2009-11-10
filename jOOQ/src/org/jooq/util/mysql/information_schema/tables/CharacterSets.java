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
public class CharacterSets extends TableImpl {

	private static final long serialVersionUID = 7878347424009653266L;

	/**
	 * The singleton instance of CHARACTER_SETS
	 */
	public static final CharacterSets CHARACTER_SETS = new CharacterSets();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CHARACTER_SET_NAME = new TableFieldImpl<String>("CHARACTER_SET_NAME", String.class, CHARACTER_SETS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DEFAULT_COLLATE_NAME = new TableFieldImpl<String>("DEFAULT_COLLATE_NAME", String.class, CHARACTER_SETS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DESCRIPTION = new TableFieldImpl<String>("DESCRIPTION", String.class, CHARACTER_SETS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> MAXLEN = new TableFieldImpl<Integer>("MAXLEN", Integer.class, CHARACTER_SETS);

	/**
	 * No further instances allowed
	 */
	private CharacterSets() {
		super("CHARACTER_SETS", "information_schema");
	}
}
