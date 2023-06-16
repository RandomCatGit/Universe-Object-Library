package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Sodium is the 11th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Sodium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Sodium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Sodium() throws InstantiationException, IllegalAccessException {
		super(new Atom(11, 11, 11), "Na", (byte) 11, 22.99f, (byte) 1);
	}

}
