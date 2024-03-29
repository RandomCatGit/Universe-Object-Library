package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Thulium is the 69th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Thulium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Thulium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Thulium() throws InstantiationException, IllegalAccessException {
		super(new Atom(69, 69, 69), "Tm", (byte) 69, 168.93f, (byte) 3);
	}

}
