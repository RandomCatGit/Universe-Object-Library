package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Rhenium is the 75th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rhenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rhenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rhenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(75, 75, 75), "Re", (byte) 75, 186.21f, (byte) 7);
	}

}
