package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Tantalum
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Tantalum is the 73rd element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Tantalum extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Tantalum
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Tantalum() throws InstantiationException, IllegalAccessException {
		super(new Atom(73, 73, 73), "Ta", (byte) 73, 180.95f);
	}

}