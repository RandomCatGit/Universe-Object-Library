package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Meitnerium is the 109th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Meitnerium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Meitnerium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Meitnerium() throws InstantiationException, IllegalAccessException {
		super(new Atom(109, 109, 109), "Mt", (byte) 109, 278f, (byte) -1);
	}

}
