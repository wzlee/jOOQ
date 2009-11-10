/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 *
 * Time zone names
 */
public class TimeZoneName extends TableImpl {

	private static final long serialVersionUID = -4516732980486741415L;

	/**
	 * The singleton instance of time_zone_name
	 */
	public static final TimeZoneName TIME_ZONE_NAME = new TimeZoneName();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("Name", String.class, TIME_ZONE_NAME);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> TIME_ZONE_ID = new TableFieldImpl<Integer>("Time_zone_id", Integer.class, TIME_ZONE_NAME);

	/**
	 * No further instances allowed
	 */
	private TimeZoneName() {
		super("time_zone_name", "mysql");
	}
}
