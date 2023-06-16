package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Lithium is the 3rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lithium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lithium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lithium() throws InstantiationException, IllegalAccessException {
		super(new Atom(3, 3, 3), "Li", (byte) 3, 6.94f, (byte) 1);
	}

}
