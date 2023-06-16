package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Plutonium is the 94th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Plutonium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Plutonium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Plutonium() throws InstantiationException, IllegalAccessException {
		super(new Atom(94, 94, 94), "Pu", (byte) 94, 244f, (byte) 6);
	}

}
