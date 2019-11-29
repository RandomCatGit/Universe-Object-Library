package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Thorium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Thorium is the 90th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Thorium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Thorium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Thorium() throws InstantiationException, IllegalAccessException {
		super(new Atom(90, 90, 90), "Th", (byte) 90, 232.04f);
	}

}
