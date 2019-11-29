package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Lutetium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Lutetium is the 71st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Lutetium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Lutetium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lutetium() throws InstantiationException, IllegalAccessException {
		super(new Atom(71, 71, 71), "Lu", (byte) 71, 174.97f);
	}

}
