package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Hafnium is the 72nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Hafnium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Hafnium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Hafnium() throws InstantiationException, IllegalAccessException {
		super(new Atom(72, 72, 72), "Hf", (byte) 72, 178.49f, (byte) 4);
	}

}
