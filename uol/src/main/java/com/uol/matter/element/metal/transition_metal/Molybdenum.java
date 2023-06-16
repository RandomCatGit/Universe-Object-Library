package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Molybdenum is the 42nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Molybdenum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Molybdenum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Molybdenum() throws InstantiationException, IllegalAccessException {
		super(new Atom(42, 42, 42), "Mo", (byte) 42, 95.95f, (byte) 6);
	}

}
