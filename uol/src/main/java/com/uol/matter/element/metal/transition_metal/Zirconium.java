package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Zirconium is the 40th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Zirconium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Zirconium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Zirconium() throws InstantiationException, IllegalAccessException {
		super(new Atom(40, 40, 40), "Zr", (byte) 40, 91.224f, (byte) 4);
	}

}
