package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Titanium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Titanium is the 22nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Titanium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Titanium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Titanium() throws InstantiationException, IllegalAccessException {
		super(new Atom(22, 22, 22), "Ti", (byte) 22, 47.867f, (byte) 4);
	}

}
