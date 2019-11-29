package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tellurium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Tellurium is the 52nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Tellurium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Tellurium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tellurium() throws InstantiationException, IllegalAccessException {
		super(new Atom(52, 52, 52), "Te", (byte) 52, 127.6f);
	}

}
