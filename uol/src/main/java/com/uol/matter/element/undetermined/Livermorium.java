package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Livermorium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
 */

/**
 * Livermorium is the 116th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Livermorium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Livermorium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Livermorium() throws InstantiationException, IllegalAccessException {
		super(new Atom(116, 116, 116), "Lv", (byte) 116, 293f, (byte) -1);
	}

}
