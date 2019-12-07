package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Nobelium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Nobelium is the 102nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Nobelium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Nobelium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Nobelium() throws InstantiationException, IllegalAccessException {
		super(new Atom(102, 102, 102), "No", (byte) 102, 259f, (byte) 3);
	}

}
