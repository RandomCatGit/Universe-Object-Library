package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Chromium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Chromium is the 24th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Chromium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Chromium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Chromium() throws InstantiationException, IllegalAccessException {
		super(new Atom(24, 24, 24), "Cr", (byte) 24, 51.996f, (byte) 6);
	}

}
