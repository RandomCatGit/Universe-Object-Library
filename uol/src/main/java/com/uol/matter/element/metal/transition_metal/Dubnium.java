package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Dubnium is the 105th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Dubnium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Dubnium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Dubnium() throws InstantiationException, IllegalAccessException {
		super(new Atom(105, 105, 105), "Db", (byte) 105, 268f, (byte) 5);
	}

}
