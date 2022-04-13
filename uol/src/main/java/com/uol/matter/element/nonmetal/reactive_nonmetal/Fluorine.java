package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Fluorine
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Fluorine is the 9th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Fluorine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Fluorine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Fluorine() throws InstantiationException, IllegalAccessException {
		super(new Atom(9, 9, 9), "F", (byte) 9, 18.998f, (byte) 1);
	}

}
