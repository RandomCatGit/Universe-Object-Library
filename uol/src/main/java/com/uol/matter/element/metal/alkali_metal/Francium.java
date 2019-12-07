package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Francium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Francium is the 87th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Francium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Francium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Francium() throws InstantiationException, IllegalAccessException {
		super(new Atom(87, 87, 87), "Fr", (byte) 87, 223f, (byte) 1);
	}

}
