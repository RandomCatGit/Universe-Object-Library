package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Phosphorus
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Phosphorus is the 15th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Phosphorus extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Phosphorus
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Phosphorus() throws InstantiationException, IllegalAccessException {
		super(new Atom(15, 15, 15), "P", (byte) 15, 30.974f);
	}

}
