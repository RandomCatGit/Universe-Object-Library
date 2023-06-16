package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Bohrium is the 107th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Bohrium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Bohrium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Bohrium() throws InstantiationException, IllegalAccessException {
		super(new Atom(107, 107, 107), "Bh", (byte) 107, 270f, (byte) 7);
	}

}
