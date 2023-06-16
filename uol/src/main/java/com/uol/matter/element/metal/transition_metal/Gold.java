package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Gold is the 79th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Gold extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Gold
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Gold() throws InstantiationException, IllegalAccessException {
		super(new Atom(79, 79, 79), "Au", (byte) 79, 196.97f, (byte) 5);
	}

}
