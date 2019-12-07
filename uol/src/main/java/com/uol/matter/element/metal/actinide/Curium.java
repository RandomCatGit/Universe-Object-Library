package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Curium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Curium is the 96th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Curium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Curium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Curium() throws InstantiationException, IllegalAccessException {
		super(new Atom(96, 96, 96), "Cm", (byte) 96, 247f, (byte) 4);
	}

}
