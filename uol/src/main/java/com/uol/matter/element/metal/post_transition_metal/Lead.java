package com.uol.matter.element.metal.post_transition_metal;

import com.uol.matter.atomic_particle.Atom;
import com.uol.matter.element.Element;

/**
 * Lead is the 82nd element in the periodic table.
 *
 * @author RandomCatGit
 */
public final class Lead extends Element {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor of RWO Lead
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Lead() throws InstantiationException, IllegalAccessException {
		super(new Atom(82, 82, 82), "Pb", (byte) 82, 207.2f, (byte) 4);
	}

}
