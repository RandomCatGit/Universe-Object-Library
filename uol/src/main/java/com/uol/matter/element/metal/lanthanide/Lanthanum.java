package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Lanthanum is the 57th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lanthanum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lanthanum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lanthanum() throws InstantiationException, IllegalAccessException {
		super(new Atom(57, 57, 57), "La", (byte) 57, 138.91f, (byte) 3);
	}

}
