package com.uol.matter.element.nonmetal.reactive_nonmetal.isotope;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tritium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								15/01/2019
 */

/**
 * Tritium is an isotope of {@linkplain Hydrogen} with two neutrons.
 *
 * @author RandomCatGit
 */
public class Tritium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Tritium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tritium() throws InstantiationException, IllegalAccessException {
		super(new Atom(1, 2, 1), "T", (byte) 1, 3.0160492f, (byte) 1);
	}

}
