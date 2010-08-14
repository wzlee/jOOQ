/**
 * This class is generated by jOOQ
 */
package org.jooq.test.generatedclasses.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends TableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The book ID
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 */
	public static final TableField<Integer> AUTHOR_ID = new TableFieldImpl<Integer>("AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<String> TITLE = new TableFieldImpl<String>("TITLE", String.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", Test.TEST);
	}
}
