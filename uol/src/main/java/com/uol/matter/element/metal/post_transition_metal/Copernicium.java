package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Copernicium is the 112th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Copernicium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Copernicium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Copernicium() throws InstantiationException, IllegalAccessException {
		super(new Atom(112, 112, 112), "Cn", (byte) 112, 285f, (byte) -1);
	}

}
