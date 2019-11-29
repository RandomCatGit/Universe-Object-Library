package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Scandium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Scandium is the 21st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Scandium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Scandium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Scandium() throws InstantiationException, IllegalAccessException {
		super(new Atom(21, 21, 21), "Sc", (byte) 21, 44.956f);
	}

}
