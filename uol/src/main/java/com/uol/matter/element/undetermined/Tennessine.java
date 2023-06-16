package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Tennessine is the 117th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Tennessine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Tennessine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tennessine() throws InstantiationException, IllegalAccessException {
		super(new Atom(117, 117, 117), "Ts", (byte) 117, 294f, (byte) -1);
	}

}
