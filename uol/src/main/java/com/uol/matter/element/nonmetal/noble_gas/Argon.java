package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Argon is the 18th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Argon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Argon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Argon() throws InstantiationException, IllegalAccessException {
		super(new Atom(18, 18, 18), "Ar", (byte) 18, 39.948f, (byte) 0);
	}

}
