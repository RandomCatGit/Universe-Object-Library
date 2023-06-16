package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Tungsten is the 74th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Tungsten extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Tungsten
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tungsten() throws InstantiationException, IllegalAccessException {
		super(new Atom(74, 74, 74), "W", (byte) 74, 183.84f, (byte) 6);
	}

}
