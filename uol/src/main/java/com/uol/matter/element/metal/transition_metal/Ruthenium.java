package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Ruthenium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Ruthenium is the 44th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Ruthenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Ruthenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Ruthenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(44, 44, 44), "Ru", (byte) 44, 101.07f, (byte) 6);
	}

}
