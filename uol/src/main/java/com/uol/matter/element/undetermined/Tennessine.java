package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tennessine
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Tennessine is the 117th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Tennessine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Tennessine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tennessine() throws InstantiationException, IllegalAccessException {
		super(new Atom(117, 117, 117), "Ts", (byte) 117, 294f, (byte) -1);
	}

}
