package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Neon is the 10th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Neon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Neon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Neon() throws InstantiationException, IllegalAccessException {
		super(new Atom(10, 10, 10), "Ne", (byte) 10, 20.18f, (byte) 0);
	}

}
