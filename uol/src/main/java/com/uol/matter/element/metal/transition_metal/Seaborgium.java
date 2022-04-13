package com.uol.matter.element.metal.transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Seaborgium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Seaborgium is the 106th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Seaborgium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Seaborgium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Seaborgium() throws InstantiationException, IllegalAccessException {
		super(new Atom(106, 106, 106), "Sg", (byte) 106, 269f, (byte) 6);
	}

}
