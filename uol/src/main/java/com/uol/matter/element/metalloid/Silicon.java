package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Silicon is the 14th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Silicon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Silicon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Silicon() throws InstantiationException, IllegalAccessException {
		super(new Atom(14, 14, 14), "Si", (byte) 14, 28.085f, (byte) 4);
	}

}
