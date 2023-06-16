package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Ytterbium is the 70th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Ytterbium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Ytterbium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Ytterbium() throws InstantiationException, IllegalAccessException {
		super(new Atom(70, 70, 70), "Yb", (byte) 70, 173.05f, (byte) 3);
	}

}
