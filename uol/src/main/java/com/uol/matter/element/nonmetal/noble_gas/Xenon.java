package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Xenon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Xenon is the 54th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Xenon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Xenon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Xenon() throws InstantiationException, IllegalAccessException {
		super(new Atom(54, 54, 54), "Xe", (byte) 54, 131.29f, (byte) 0);
	}

}
