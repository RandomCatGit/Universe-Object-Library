package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Neodymium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Neodymium is the 60th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Neodymium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Neodymium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Neodymium() throws InstantiationException, IllegalAccessException {
		super(new Atom(60, 60, 60), "Nd", (byte) 60, 144.24f);
	}

}
