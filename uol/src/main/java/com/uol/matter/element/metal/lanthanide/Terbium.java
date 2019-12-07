package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Terbium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Terbium is the 65th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Terbium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Terbium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Terbium() throws InstantiationException, IllegalAccessException {
		super(new Atom(65, 65, 65), "Tb", (byte) 65, 158.93f, (byte) 3);
	}

}
