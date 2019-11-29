package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Germanium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Germanium is the 32nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Germanium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Germanium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Germanium() throws InstantiationException, IllegalAccessException {
		super(new Atom(32, 32, 32), "Ge", (byte) 32, 72.63f);
	}

}
