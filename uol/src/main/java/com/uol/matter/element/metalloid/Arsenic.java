package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Arsenic
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Arsenic is the 33rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Arsenic extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Arsenic
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Arsenic() throws InstantiationException, IllegalAccessException {
		super(new Atom(33, 33, 33), "As", (byte) 33, 74.922f, (byte) 5);
	}

}
