package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Americium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Americium is the 95th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Americium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Americium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Americium() throws InstantiationException, IllegalAccessException {
		super(new Atom(95, 95, 95), "Am", (byte) 95, 243f);
	}

}
