package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Oxygen
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Oxygen is the 8th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Oxygen extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Oxygen
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Oxygen() throws InstantiationException, IllegalAccessException {
		super(new Atom(8, 8, 8), "O", (byte) 8, 15.999f, (byte) 2);
	}

}
