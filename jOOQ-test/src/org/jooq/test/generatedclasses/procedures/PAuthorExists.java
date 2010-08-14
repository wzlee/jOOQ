/**
 * This class is generated by jOOQ
 */
package org.jooq.test.generatedclasses.procedures;

import org.jooq.impl.Parameter;
import org.jooq.impl.StoredProcedureImpl;


/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 1L;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new Parameter<String>("author_name", String.class);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Boolean> RESULT = new Parameter<Boolean>("result", Boolean.class);

	/**
	 * No further instances allowed
	 */
	public PAuthorExists() {
		super("p_author_exists");

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public Boolean getResult() {
		return getValue(RESULT);
	}
}
