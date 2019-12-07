package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Niobium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Niobium is the 41st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Niobium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Niobium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Niobium() throws InstantiationException, IllegalAccessException {
		super(new Atom(41, 41, 41), "Nb", (byte) 41, 92.906f, (byte) 5);
	}

}
