package com.uol.matter.element.metal.alkaline_earth_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Radium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Radium is the 88th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Radium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Radium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Radium() throws InstantiationException, IllegalAccessException {
		super(new Atom(88, 88, 88), "Ra", (byte) 88, 226f, (byte) 2);
	}

}
