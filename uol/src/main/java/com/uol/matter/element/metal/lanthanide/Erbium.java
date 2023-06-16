package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Erbium is the 68th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Erbium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Erbium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Erbium() throws InstantiationException, IllegalAccessException {
		super(new Atom(68, 68, 68), "Er", (byte) 68, 167.26f, (byte) 3);
	}

}
