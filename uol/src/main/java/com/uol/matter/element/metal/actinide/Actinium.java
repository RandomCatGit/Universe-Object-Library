package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Actinium is the 89th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Actinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Actinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Actinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(89, 89, 89), "Ac", (byte) 89, 227f, (byte) 3);
	}

}
