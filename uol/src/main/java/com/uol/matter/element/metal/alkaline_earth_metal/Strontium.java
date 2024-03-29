package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Strontium is the 38th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Strontium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Strontium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Strontium() throws InstantiationException, IllegalAccessException {
		super(new Atom(38, 38, 38), "Sr", (byte) 38, 87.62f, (byte) 2);
	}

}
