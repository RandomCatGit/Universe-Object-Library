package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tungsten
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Tungsten is the 74th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Tungsten extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Tungsten
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tungsten() throws InstantiationException, IllegalAccessException {
		super(new Atom(74, 74, 74), "W", (byte) 74, 183.84f, (byte) 6);
	}

}
