package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Caesium is the 55th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Caesium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Caesium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Caesium() throws InstantiationException, IllegalAccessException {
		super(new Atom(55, 55, 55), "Cs", (byte) 55, 132.91f, (byte) 1);
	}

}
