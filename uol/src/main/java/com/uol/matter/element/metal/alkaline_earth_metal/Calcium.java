package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Calcium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Calcium is the 20th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Calcium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Calcium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Calcium() throws InstantiationException, IllegalAccessException {
		super(new Atom(20, 20, 20), "Ca", (byte) 20, 40.078f);
	}

}
