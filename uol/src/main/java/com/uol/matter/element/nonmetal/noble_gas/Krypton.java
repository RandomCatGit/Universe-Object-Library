package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Krypton
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Krypton is the 36th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Krypton extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Krypton
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Krypton() throws InstantiationException, IllegalAccessException {
		super(new Atom(36, 36, 36), "Kr", (byte) 36, 83.798f, (byte) 0);
	}

}
