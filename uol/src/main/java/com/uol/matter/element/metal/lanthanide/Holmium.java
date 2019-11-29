package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Holmium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Holmium is the 67th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Holmium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Holmium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Holmium() throws InstantiationException, IllegalAccessException {
		super(new Atom(67, 67, 67), "Ho", (byte) 67, 164.93f);
	}

}
