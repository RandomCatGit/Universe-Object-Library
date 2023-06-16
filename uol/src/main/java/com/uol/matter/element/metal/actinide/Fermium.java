package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Fermium is the 100th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Fermium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Fermium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Fermium() throws InstantiationException, IllegalAccessException {
		super(new Atom(100, 100, 100), "Fm", (byte) 100, 257f, (byte) 3);
	}

}
