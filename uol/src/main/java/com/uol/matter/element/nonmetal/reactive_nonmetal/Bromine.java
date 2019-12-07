package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Bromine
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Bromine is the 35th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Bromine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Bromine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Bromine() throws InstantiationException, IllegalAccessException {
		super(new Atom(35, 35, 35), "Br", (byte) 35, 79.904f, (byte) 5);
	}

}
