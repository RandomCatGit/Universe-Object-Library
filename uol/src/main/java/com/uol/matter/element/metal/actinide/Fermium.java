package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Fermium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Fermium is the 100th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Fermium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Fermium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Fermium() throws InstantiationException, IllegalAccessException {
		super(new Atom(100, 100, 100), "Fm", (byte) 100, 257f, (byte) 3);
	}

}
