package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Chlorine is the 17th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Chlorine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Chlorine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Chlorine() throws InstantiationException, IllegalAccessException {
		super(new Atom(17, 17, 17), "Cl", (byte) 17, 35.45f, (byte) 5);
	}

}
