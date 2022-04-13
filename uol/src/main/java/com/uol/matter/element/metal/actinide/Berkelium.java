package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Berkelium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Berkelium is the 97th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Berkelium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Berkelium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Berkelium() throws InstantiationException, IllegalAccessException {
		super(new Atom(97, 97, 97), "Bk", (byte) 97, 247f, (byte) 4);
	}

}
