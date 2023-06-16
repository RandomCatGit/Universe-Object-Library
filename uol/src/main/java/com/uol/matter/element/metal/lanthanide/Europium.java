package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Europium is the 63rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Europium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Europium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Europium() throws InstantiationException, IllegalAccessException {
		super(new Atom(63, 63, 63), "Eu", (byte) 63, 151.96f, (byte) 3);
	}

}
