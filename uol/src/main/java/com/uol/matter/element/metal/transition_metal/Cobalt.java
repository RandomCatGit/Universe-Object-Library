package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Cobalt is the 27th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Cobalt extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Cobalt
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Cobalt() throws InstantiationException, IllegalAccessException {
		super(new Atom(27, 27, 27), "Co", (byte) 27, 58.933f, (byte) 4);
	}

}
