package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Praseodymium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Praseodymium is the 59th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Praseodymium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Praseodymium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Praseodymium() throws InstantiationException, IllegalAccessException {
		super(new Atom(59, 59, 59), "Pr", (byte) 59, 140.91f, (byte) 4);
	}

}
