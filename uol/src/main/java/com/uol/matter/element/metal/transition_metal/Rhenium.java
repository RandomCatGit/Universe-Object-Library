package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Rhenium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Rhenium is the 75th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rhenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rhenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rhenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(75, 75, 75), "Re", (byte) 75, 186.21f, (byte) 7);
	}

}
