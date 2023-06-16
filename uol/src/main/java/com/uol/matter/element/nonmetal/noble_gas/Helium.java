package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Helium is the 2nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Helium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Helium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Helium() throws InstantiationException, IllegalAccessException {
		super(new Atom(2, 2, 2), "He", (byte) 2, 4.0026f, (byte) 0);
	}

}
