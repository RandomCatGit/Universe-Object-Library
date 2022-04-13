package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Rhodium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Rhodium is the 45th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rhodium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rhodium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rhodium() throws InstantiationException, IllegalAccessException {
		super(new Atom(45, 45, 45), "Rh", (byte) 45, 102.91f, (byte) 6);
	}

}
