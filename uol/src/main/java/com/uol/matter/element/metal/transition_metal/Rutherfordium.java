package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Rutherfordium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Rutherfordium is the 104th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Rutherfordium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Rutherfordium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Rutherfordium() throws InstantiationException, IllegalAccessException {
		super(new Atom(104, 104, 104), "Rf", (byte) 104, 267f, (byte) 4);
	}

}
