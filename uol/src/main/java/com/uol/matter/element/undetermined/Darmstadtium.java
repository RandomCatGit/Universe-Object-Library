package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Darmstadtium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Darmstadtium is the 110th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Darmstadtium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Darmstadtium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Darmstadtium() throws InstantiationException, IllegalAccessException {
		super(new Atom(110, 110, 110), "Ds", (byte) 110, 281f);
	}

}
