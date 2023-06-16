package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Roentgenium is the 111th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Roentgenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Roentgenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Roentgenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(111, 111, 111), "Rg", (byte) 111, 282f, (byte) -1);
	}

}
