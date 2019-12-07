package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Iodine
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Iodine is the 53rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Iodine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Iodine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Iodine() throws InstantiationException, IllegalAccessException {
		super(new Atom(53, 53, 53), "I", (byte) 53, 126.9f, (byte) 7);
	}

}
