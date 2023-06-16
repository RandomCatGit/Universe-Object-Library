package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Seaborgium is the 106th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Seaborgium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Seaborgium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Seaborgium() throws InstantiationException, IllegalAccessException {
		super(new Atom(106, 106, 106), "Sg", (byte) 106, 269f, (byte) 6);
	}

}
