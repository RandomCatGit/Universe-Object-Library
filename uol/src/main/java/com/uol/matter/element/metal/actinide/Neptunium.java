package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Neptunium is the 93rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Neptunium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Neptunium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Neptunium() throws InstantiationException, IllegalAccessException {
		super(new Atom(93, 93, 93), "Np", (byte) 93, 237f, (byte) 6);
	}

}
