package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Iridium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Iridium is the 77th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Iridium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Iridium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Iridium() throws InstantiationException, IllegalAccessException {
		super(new Atom(77, 77, 77), "Ir", (byte) 77, 192.22f, (byte) 6);
	}

}
