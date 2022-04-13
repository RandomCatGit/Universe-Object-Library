package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Bismuth
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Bismuth is the 83rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Bismuth extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Bismuth
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Bismuth() throws InstantiationException, IllegalAccessException {
		super(new Atom(83, 83, 83), "Bi", (byte) 83, 208.98f, (byte) 5);
	}

}
