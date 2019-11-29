package com.uol.matter.element.metal.alkali_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Potassium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Potassium is the 19th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Potassium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Potassium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Potassium() throws InstantiationException, IllegalAccessException {
		super(new Atom(19, 19, 19), "K", (byte) 19, 39.098f);
	}

}
