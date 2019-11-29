package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Actinium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Actinium is the 89th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Actinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Actinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Actinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(89, 89, 89), "Ac", (byte) 89, 227f);
	}

}
