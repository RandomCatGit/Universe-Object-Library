package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Nihonium is the 113th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Nihonium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nihonium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nihonium() throws InstantiationException, IllegalAccessException {
		super(new Atom(113, 113, 113), "Nh", (byte) 113, 286f, (byte) -1);
	}

}
