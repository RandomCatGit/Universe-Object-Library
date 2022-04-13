package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Plutonium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Plutonium is the 94th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Plutonium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Plutonium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Plutonium() throws InstantiationException, IllegalAccessException {
		super(new Atom(94, 94, 94), "Pu", (byte) 94, 244f, (byte) 6);
	}

}
