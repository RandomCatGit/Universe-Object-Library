package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Silicon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Silicon is the 14th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Silicon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Silicon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Silicon() throws InstantiationException, IllegalAccessException {
		super(new Atom(14, 14, 14), "Si", (byte) 14, 28.085f);
	}

}
