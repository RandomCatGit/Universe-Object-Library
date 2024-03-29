package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Uranium is the 92nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Uranium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Uranium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Uranium() throws InstantiationException, IllegalAccessException {
		super(new Atom(92, 92, 92), "U", (byte) 92, 238.03f, (byte) 6);
	}

}
