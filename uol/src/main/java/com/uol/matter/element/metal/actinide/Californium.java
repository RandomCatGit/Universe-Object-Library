package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Californium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Californium is the 98th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Californium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Californium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Californium() throws InstantiationException, IllegalAccessException {
		super(new Atom(98, 98, 98), "Cf", (byte) 98, 251f, (byte) 4);
	}

}
