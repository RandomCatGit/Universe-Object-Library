package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Vanadium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Vanadium is the 23rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Vanadium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Vanadium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Vanadium() throws InstantiationException, IllegalAccessException {
		super(new Atom(23, 23, 23), "V", (byte) 23, 50.942f);
	}

}
