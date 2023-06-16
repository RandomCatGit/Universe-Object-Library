package com.uol.matter.element.metal.actinide;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Protactinium is the 91st element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Protactinium extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Protactinium
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Protactinium() throws InstantiationException, IllegalAccessException {
		super(new Atom(91, 91, 91), "Pa", (byte) 91, 231.04f, (byte) 5);
	}

}
