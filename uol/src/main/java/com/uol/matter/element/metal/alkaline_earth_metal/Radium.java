package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Radium is the 88th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Radium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Radium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Radium() throws InstantiationException, IllegalAccessException {
		super(new Atom(88, 88, 88), "Ra", (byte) 88, 226f, (byte) 2);
	}

}
