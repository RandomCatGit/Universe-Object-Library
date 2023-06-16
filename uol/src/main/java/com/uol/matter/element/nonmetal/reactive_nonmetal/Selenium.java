package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Selenium is the 34th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Selenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Selenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Selenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(34, 34, 34), "Se", (byte) 34, 78.971f, (byte) 6);
	}

}
