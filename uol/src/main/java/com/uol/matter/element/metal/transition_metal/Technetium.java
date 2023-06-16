package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Technetium is the 43rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Technetium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Technetium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Technetium() throws InstantiationException, IllegalAccessException {
		super(new Atom(43, 43, 43), "Tc", (byte) 43, 98f, (byte) 6);
	}

}
