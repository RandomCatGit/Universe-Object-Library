package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Flerovium is the 114th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Flerovium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Flerovium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Flerovium() throws InstantiationException, IllegalAccessException {
		super(new Atom(114, 114, 114), "Fl", (byte) 114, 289f, (byte) -1);
	}

}
