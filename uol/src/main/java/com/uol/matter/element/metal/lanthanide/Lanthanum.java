package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Lanthanum
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Lanthanum is the 57th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lanthanum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lanthanum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lanthanum() throws InstantiationException, IllegalAccessException {
		super(new Atom(57, 57, 57), "La", (byte) 57, 138.91f, (byte) 3);
	}

}
