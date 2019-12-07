package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Rubidium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Rubidium is the 37th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Rubidium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rubidium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rubidium() throws InstantiationException, IllegalAccessException {
		super(new Atom(37, 37, 37), "Rb", (byte) 37, 85.468f, (byte) 1);
	}

}
