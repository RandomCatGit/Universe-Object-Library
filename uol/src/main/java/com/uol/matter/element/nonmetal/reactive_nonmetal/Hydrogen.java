package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Hydrogen
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Hydrogen is the 1st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Hydrogen extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Hydrogen
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Hydrogen() throws InstantiationException, IllegalAccessException {
		super(new Atom(1, 0, 1), "H", (byte) 1, 1.008f);
	}

}
