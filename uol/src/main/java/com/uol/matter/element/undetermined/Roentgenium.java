package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Roentgenium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Roentgenium is the 111th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Roentgenium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Roentgenium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Roentgenium() throws InstantiationException, IllegalAccessException {
		super(new Atom(111, 111, 111), "Rg", (byte) 111, 282f, (byte) -1);
	}

}
