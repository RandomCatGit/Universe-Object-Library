package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Gallium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Gallium is the 31st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Gallium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Gallium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Gallium() throws InstantiationException, IllegalAccessException {
		super(new Atom(31, 31, 31), "Ga", (byte) 31, 69.723f);
	}

}
