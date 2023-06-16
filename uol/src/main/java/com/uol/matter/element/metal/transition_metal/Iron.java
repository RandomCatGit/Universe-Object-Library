package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Iron is the 26th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Iron extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Iron
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Iron() throws InstantiationException, IllegalAccessException {
		super(new Atom(26, 26, 26), "Fe", (byte) 26, 55.845f, (byte) 3);
	}

}
