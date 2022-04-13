package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Molybdenum
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Molybdenum is the 42nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Molybdenum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Molybdenum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Molybdenum() throws InstantiationException, IllegalAccessException {
		super(new Atom(42, 42, 42), "Mo", (byte) 42, 95.95f, (byte) 6);
	}

}
