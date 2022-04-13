package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Nickel
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Nickel is the 28th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Nickel extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nickel
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nickel() throws InstantiationException, IllegalAccessException {
		super(new Atom(28, 28, 28), "Ni", (byte) 28, 58.693f, (byte) 2);
	}

}
