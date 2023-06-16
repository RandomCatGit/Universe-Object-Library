package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Nickel is the 28th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Nickel extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nickel
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nickel() throws InstantiationException, IllegalAccessException {
		super(new Atom(28, 28, 28), "Ni", (byte) 28, 58.693f, (byte) 2);
	}

}
