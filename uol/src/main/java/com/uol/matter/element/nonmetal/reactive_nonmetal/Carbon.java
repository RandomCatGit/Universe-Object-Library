package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Carbon is the 6th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Carbon extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Carbon
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Carbon() throws InstantiationException, IllegalAccessException {
		super(new Atom(6, 6, 6), "C", (byte) 6, 12.011f, (byte) 4);
	}

}
