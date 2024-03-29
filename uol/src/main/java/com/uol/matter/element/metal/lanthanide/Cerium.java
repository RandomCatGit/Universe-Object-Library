package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Cerium is the 58th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Cerium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Cerium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Cerium() throws InstantiationException, IllegalAccessException {
		super(new Atom(58, 58, 58), "Ce", (byte) 58, 140.12f, (byte) 4);
	}

}
