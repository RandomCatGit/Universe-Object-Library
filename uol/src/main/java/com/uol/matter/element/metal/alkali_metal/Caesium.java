package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Caesium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Caesium is the 55th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Caesium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Caesium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Caesium() throws InstantiationException, IllegalAccessException {
		super(new Atom(55, 55, 55), "Cs", (byte) 55, 132.91f);
	}

}
