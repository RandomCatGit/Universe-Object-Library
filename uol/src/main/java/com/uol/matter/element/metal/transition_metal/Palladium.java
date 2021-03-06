package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Palladium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Palladium is the 46th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Palladium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Palladium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Palladium() throws InstantiationException, IllegalAccessException {
		super(new Atom(46, 46, 46), "Pd", (byte) 46, 106.42f, (byte) 4);
	}

}
