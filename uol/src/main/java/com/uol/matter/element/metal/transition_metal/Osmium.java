package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Osmium is the 76th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Osmium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Osmium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Osmium() throws InstantiationException, IllegalAccessException {
		super(new Atom(76, 76, 76), "Os", (byte) 76, 190.23f, (byte) 6);
	}

}
