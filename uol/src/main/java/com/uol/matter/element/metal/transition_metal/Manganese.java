package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Manganese
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Manganese is the 25th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Manganese extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Manganese
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Manganese() throws InstantiationException, IllegalAccessException {
		super(new Atom(25, 25, 25), "Mn", (byte) 25, 54.938f);
	}

}
