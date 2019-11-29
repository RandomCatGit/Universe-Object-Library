package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tin
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Tin is the 50th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Tin extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Tin
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tin() throws InstantiationException, IllegalAccessException {
		super(new Atom(50, 50, 50), "Sn", (byte) 50, 118.71f);
	}

}
