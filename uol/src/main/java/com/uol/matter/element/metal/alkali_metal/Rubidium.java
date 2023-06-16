package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Rubidium is the 37th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rubidium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rubidium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rubidium() throws InstantiationException, IllegalAccessException {
		super(new Atom(37, 37, 37), "Rb", (byte) 37, 85.468f, (byte) 1);
	}

}
