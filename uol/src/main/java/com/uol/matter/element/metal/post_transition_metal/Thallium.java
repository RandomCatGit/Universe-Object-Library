package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Thallium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Thallium is the 81st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Thallium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Thallium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Thallium() throws InstantiationException, IllegalAccessException {
		super(new Atom(81, 81, 81), "Tl", (byte) 81, 204.38f);
	}

}
