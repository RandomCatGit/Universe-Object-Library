package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Cadmium is the 48th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Cadmium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Cadmium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Cadmium() throws InstantiationException, IllegalAccessException {
		super(new Atom(48, 48, 48), "Cd", (byte) 48, 112.41f, (byte) 2);
	}

}
