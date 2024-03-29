package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Zinc is the 30th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Zinc extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Zinc
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Zinc() throws InstantiationException, IllegalAccessException {
		super(new Atom(30, 30, 30), "Zn", (byte) 30, 65.38f, (byte) 2);
	}

}
