package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Mercury is the 80th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Mercury extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Mercury
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Mercury() throws InstantiationException, IllegalAccessException {
		super(new Atom(80, 80, 80), "Hg", (byte) 80, 200.59f, (byte) 2);
	}

}
