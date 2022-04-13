package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Aluminium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Aluminium is the 13th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Aluminium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Aluminium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Aluminium() throws InstantiationException, IllegalAccessException {
		super(new Atom(13, 13, 13), "Al", (byte) 13, 26.982f, (byte) 3);
	}

}
