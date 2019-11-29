package com.uol.matter.element.metalloid;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Astatine
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Astatine is the 85th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Astatine extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Astatine
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Astatine() throws InstantiationException, IllegalAccessException {
		super(new Atom(85, 85, 85), "At", (byte) 85, 210f);
	}

}
