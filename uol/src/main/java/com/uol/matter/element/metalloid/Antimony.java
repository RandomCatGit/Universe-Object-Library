package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Antimony is the 51st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Antimony extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Antimony
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Antimony() throws InstantiationException, IllegalAccessException {
		super(new Atom(51, 51, 51), "Sb", (byte) 51, 121.76f, (byte) 5);
	}

}
