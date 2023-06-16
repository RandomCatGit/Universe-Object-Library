package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Yttrium is the 39th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Yttrium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Yttrium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Yttrium() throws InstantiationException, IllegalAccessException {
		super(new Atom(39, 39, 39), "Y", (byte) 39, 88.906f, (byte) 3);
	}

}
