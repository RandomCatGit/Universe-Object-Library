package com.uol.matter.element.metal.lanthanide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Promethium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 */

/**
 * Promethium is the 61st element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Promethium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Promethium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Promethium() throws InstantiationException, IllegalAccessException {
		super(new Atom(61, 61, 61), "Pm", (byte) 61, 145f, (byte) 3);
	}

}
