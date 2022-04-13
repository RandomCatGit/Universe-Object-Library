package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Protactinium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Protactinium is the 91st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Protactinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Protactinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Protactinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(91, 91, 91), "Pa", (byte) 91, 231.04f, (byte) 5);
	}

}
