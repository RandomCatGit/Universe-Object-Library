package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Silver
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Silver is the 47th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Silver extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Silver
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Silver() throws InstantiationException, IllegalAccessException {
		super(new Atom(47, 47, 47), "Ag", (byte) 47, 107.87f, (byte) 1);
	}

}
