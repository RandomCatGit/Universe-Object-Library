package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Radon is the 86th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Radon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Radon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Radon() throws InstantiationException, IllegalAccessException {
		super(new Atom(86, 86, 86), "Rn", (byte) 86, 222f, (byte) 0);
	}

}
