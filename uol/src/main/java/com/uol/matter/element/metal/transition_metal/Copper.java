package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Copper is the 29th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Copper extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Copper
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Copper() throws InstantiationException, IllegalAccessException {
		super(new Atom(29, 29, 29), "Cu", (byte) 29, 63.546f, (byte) 2);
	}

}
