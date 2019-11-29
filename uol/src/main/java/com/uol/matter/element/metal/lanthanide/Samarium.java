package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Samarium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Samarium is the 62nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Samarium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Samarium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Samarium() throws InstantiationException, IllegalAccessException {
		super(new Atom(62, 62, 62), "Sm", (byte) 62, 150.36f);
	}

}
