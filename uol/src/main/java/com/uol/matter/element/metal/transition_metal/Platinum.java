package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Platinum is the 78th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Platinum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Platinum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Platinum() throws InstantiationException, IllegalAccessException {
		super(new Atom(78, 78, 78), "Pt", (byte) 78, 195.08f, (byte) 6);
	}

}
