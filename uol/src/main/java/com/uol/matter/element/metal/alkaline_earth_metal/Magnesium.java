package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Magnesium is the 12th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Magnesium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Magnesium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Magnesium() throws InstantiationException, IllegalAccessException {
		super(new Atom(12, 12, 12), "Mg", (byte) 12, 24.305f, (byte) 2);
	}

}
