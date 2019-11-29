package com.uol.matter.element.undetermined;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/*
 * RWO: Livermorium
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								10/01/2019
 */

/**
 * Livermorium is the 116th element in the periodic table.
 *
 * @author RandomCatGit
 */
public class Livermorium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Livermorium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Livermorium() throws InstantiationException, IllegalAccessException {
		super(new Atom(116, 116, 116), "Lv", (byte) 116, 293f);
	}

}
