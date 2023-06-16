package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Scandium is the 21st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Scandium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Scandium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Scandium() throws InstantiationException, IllegalAccessException {
		super(new Atom(21, 21, 21), "Sc", (byte) 21, 44.956f, (byte) 3);
	}

}
