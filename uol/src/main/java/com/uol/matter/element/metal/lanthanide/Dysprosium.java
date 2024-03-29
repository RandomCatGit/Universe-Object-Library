package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Dysprosium is the 66th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Dysprosium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Dysprosium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Dysprosium() throws InstantiationException, IllegalAccessException {
		super(new Atom(66, 66, 66), "Dy", (byte) 66, 162.5f, (byte) 3);
	}

}
