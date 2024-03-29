package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Oganesson is the 118th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Oganesson extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Oganesson
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Oganesson() throws InstantiationException, IllegalAccessException {
		super(new Atom(118, 118, 118), "Og", (byte) 118, 294f, (byte) -1);
	}

}
