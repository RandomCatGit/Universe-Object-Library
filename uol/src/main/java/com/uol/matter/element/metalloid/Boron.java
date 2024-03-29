package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Boron is the 5th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Boron extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Boron
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Boron() throws InstantiationException, IllegalAccessException {
		super(new Atom(5, 5, 5), "B", (byte) 5, 10.81f, (byte) 3);
	}

}
