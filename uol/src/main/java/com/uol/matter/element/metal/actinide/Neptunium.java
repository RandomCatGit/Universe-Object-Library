package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Neptunium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Neptunium is the 93rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Neptunium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Neptunium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Neptunium() throws InstantiationException, IllegalAccessException {
		super(new Atom(93, 93, 93), "Np", (byte) 93, 237f, (byte) 6);
	}

}
