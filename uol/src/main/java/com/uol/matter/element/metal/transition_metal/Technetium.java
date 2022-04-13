package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Technetium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Technetium is the 43rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Technetium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Technetium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Technetium() throws InstantiationException, IllegalAccessException {
		super(new Atom(43, 43, 43), "Tc", (byte) 43, 98f, (byte) 6);
	}

}
