package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Oganesson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Oganesson is the 118th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Oganesson extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Oganesson
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Oganesson() throws InstantiationException, IllegalAccessException {
		super(new Atom(118, 118, 118), "Og", (byte) 118, 294f, (byte) -1);
	}

}
