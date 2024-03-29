package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Moscovium is the 115th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Moscovium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Moscovium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Moscovium() throws InstantiationException, IllegalAccessException {
		super(new Atom(115, 115, 115), "Mc", (byte) 115, 290f, (byte) -1);
	}

}
