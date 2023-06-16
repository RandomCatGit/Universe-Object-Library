package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Californium is the 98th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Californium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Californium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Californium() throws InstantiationException, IllegalAccessException {
		super(new Atom(98, 98, 98), "Cf", (byte) 98, 251f, (byte) 4);
	}

}
