package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Lawrencium is the 103rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lawrencium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lawrencium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lawrencium() throws InstantiationException, IllegalAccessException {
		super(new Atom(103, 103, 103), "Lr", (byte) 103, 266f, (byte) 3);
	}

}
