package com.uol.matter.element.nonmetal.reactive_nonmetal.isotope;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Deuterium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								15/01/2019
 */

/**
 * Deuterium is an isotope of {@linkplain Hydrogen} with a neutron.
 *
 * @author RandomCatGit
 */
public final class Deuterium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Deuterium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Deuterium() throws InstantiationException, IllegalAccessException {
		super(new Atom(1, 1, 1), "D", (byte) 1, 2.01410178f, (byte) 1);
	}

}
