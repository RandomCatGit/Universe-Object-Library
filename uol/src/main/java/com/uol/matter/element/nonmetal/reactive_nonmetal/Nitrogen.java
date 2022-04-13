package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Nitrogen
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Nitrogen is the 7th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Nitrogen extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nitrogen
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nitrogen() throws InstantiationException, IllegalAccessException {
		super(new Atom(7, 7, 7), "N", (byte) 7, 14.007f, (byte) 3);
	}

}
