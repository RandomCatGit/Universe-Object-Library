package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Gadolinium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Gadolinium is the 64th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Gadolinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Gadolinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Gadolinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(64, 64, 64), "Gd", (byte) 64, 157.25f, (byte) 3);
	}

}
