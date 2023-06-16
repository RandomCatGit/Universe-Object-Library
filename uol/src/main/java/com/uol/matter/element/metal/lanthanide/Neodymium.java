package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Neodymium is the 60th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Neodymium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Neodymium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Neodymium() throws InstantiationException, IllegalAccessException {
		super(new Atom(60, 60, 60), "Nd", (byte) 60, 144.24f, (byte) 3);
	}

}
