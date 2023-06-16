package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Rhodium is the 45th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rhodium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rhodium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rhodium() throws InstantiationException, IllegalAccessException {
		super(new Atom(45, 45, 45), "Rh", (byte) 45, 102.91f, (byte) 6);
	}

}
