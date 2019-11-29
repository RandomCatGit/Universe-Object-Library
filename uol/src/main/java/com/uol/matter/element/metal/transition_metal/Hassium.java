package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Hassium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Hassium is the 108th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Hassium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Hassium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Hassium() throws InstantiationException, IllegalAccessException {
		super(new Atom(108, 108, 108), "Hs", (byte) 108, 270f);
	}

}
