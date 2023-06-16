package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Holmium is the 67th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Holmium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Holmium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Holmium() throws InstantiationException, IllegalAccessException {
		super(new Atom(67, 67, 67), "Ho", (byte) 67, 164.93f, (byte) 3);
	}

}
