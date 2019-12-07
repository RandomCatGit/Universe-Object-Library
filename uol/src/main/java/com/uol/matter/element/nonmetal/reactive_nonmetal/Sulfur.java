package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Sulfur
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Sulfur is the 16th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Sulfur extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Sulfur
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Sulfur() throws InstantiationException, IllegalAccessException {
		super(new Atom(16, 16, 16), "S", (byte) 16, 32.06f, (byte) 6);
	}

}
