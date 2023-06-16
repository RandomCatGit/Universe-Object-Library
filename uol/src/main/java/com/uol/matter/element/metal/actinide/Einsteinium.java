package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Einsteinium is the 99th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Einsteinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Einsteinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Einsteinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(99, 99, 99), "Es", (byte) 99, 252f, (byte) 4);
	}

}
