package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Magnesium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Magnesium is the 12th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Magnesium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Magnesium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Magnesium() throws InstantiationException, IllegalAccessException {
		super(new Atom(12, 12, 12), "Mg", (byte) 12, 24.305f);
	}

}
