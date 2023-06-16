package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Lutetium is the 71st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lutetium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lutetium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lutetium() throws InstantiationException, IllegalAccessException {
		super(new Atom(71, 71, 71), "Lu", (byte) 71, 174.97f, (byte) 3);
	}

}
