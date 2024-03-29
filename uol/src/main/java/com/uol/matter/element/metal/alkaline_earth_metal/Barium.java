package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Barium is the 56th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Barium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Barium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Barium() throws InstantiationException, IllegalAccessException {
		super(new Atom(56, 56, 56), "Ba", (byte) 56, 137.33f, (byte) 2);
	}

}
