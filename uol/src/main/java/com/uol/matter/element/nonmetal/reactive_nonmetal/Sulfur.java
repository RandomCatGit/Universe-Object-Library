package com.uol.matter.element.nonmetal.reactive_nonmetal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Sulfur is the 16th element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Sulfur extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Sulfur
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Sulfur() throws InstantiationException, IllegalAccessException {
		super(new Atom(16, 16, 16), "S", (byte) 16, 32.06f, (byte) 6);
	}

}
