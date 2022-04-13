package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Meitnerium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Meitnerium is the 109th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Meitnerium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Meitnerium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Meitnerium() throws InstantiationException, IllegalAccessException {
		super(new Atom(109, 109, 109), "Mt", (byte) 109, 278f, (byte) -1);
	}

}
