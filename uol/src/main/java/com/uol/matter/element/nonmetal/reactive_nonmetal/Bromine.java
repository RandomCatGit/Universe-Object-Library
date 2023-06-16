package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Bromine is the 35th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Bromine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Bromine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Bromine() throws InstantiationException, IllegalAccessException {
		super(new Atom(35, 35, 35), "Br", (byte) 35, 79.904f, (byte) 5);
	}

}
