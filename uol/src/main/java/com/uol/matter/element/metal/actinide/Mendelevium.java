package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Mendelevium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Mendelevium is the 101st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Mendelevium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Mendelevium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Mendelevium() throws InstantiationException, IllegalAccessException {
		super(new Atom(101, 101, 101), "Md", (byte) 101, 258f, (byte) 3);
	}

}
