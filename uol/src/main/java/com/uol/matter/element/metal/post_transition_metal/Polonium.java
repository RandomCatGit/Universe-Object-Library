package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Polonium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Polonium is the 84th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Polonium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Polonium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Polonium() throws InstantiationException, IllegalAccessException {
		super(new Atom(84, 84, 84), "Po", (byte) 84, 209f, (byte) 6);
	}

}
