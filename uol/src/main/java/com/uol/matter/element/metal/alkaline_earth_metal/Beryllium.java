package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Beryllium is the 4th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Beryllium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Beryllium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Beryllium() throws InstantiationException, IllegalAccessException {
		super(new Atom(4, 4, 4), "Be", (byte) 4, 9.0122f, (byte) 2);
	}

}
