package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Nitrogen is the 7th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Nitrogen extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nitrogen
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nitrogen() throws InstantiationException, IllegalAccessException {
		super(new Atom(7, 7, 7), "N", (byte) 7, 14.007f, (byte) 3);
	}

}
