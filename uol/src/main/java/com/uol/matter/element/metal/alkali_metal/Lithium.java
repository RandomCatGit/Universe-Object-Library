package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Lithium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Lithium is the 3rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Lithium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lithium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lithium() throws InstantiationException, IllegalAccessException {
		super(new Atom(3, 3, 3), "Li", (byte) 3, 6.94f, (byte) 1);
	}

}
