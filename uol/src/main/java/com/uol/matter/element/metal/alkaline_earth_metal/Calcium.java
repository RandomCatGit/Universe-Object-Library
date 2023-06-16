package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Calcium is the 20th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Calcium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Calcium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Calcium() throws InstantiationException, IllegalAccessException {
		super(new Atom(20, 20, 20), "Ca", (byte) 20, 40.078f, (byte) 2);
	}

}
