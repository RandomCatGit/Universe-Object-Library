package com.uol.matter.element.nonmetal.noble_gas;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Radon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Radon is the 86th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Radon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Radon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Radon() throws InstantiationException, IllegalAccessException {
		super(new Atom(86, 86, 86), "Rn", (byte) 86, 222f, (byte) 0);
	}

}
