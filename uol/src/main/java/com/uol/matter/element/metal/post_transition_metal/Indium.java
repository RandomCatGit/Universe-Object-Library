package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Indium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Indium is the 49th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Indium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Indium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Indium() throws InstantiationException, IllegalAccessException {
		super(new Atom(49, 49, 49), "In", (byte) 49, 114.82f, (byte) 3);
	}

}
