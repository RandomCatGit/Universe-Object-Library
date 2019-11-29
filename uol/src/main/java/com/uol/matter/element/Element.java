package com.uol.matter.element;

import com.uol.UniverseObjectLibrary;
import com.uol.matter.atomic_particle.Atom;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * RWP: Element
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWP								1/9/2018
 */

/**
 * Element is the RWP class on common properties of all elements
 *
 * @author RandomCatGit
 */
@Getter
@Setter(AccessLevel.NONE)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Element extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP Element
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * atomicStructure provides atomic elements within the atom.
	 */
	private Atom atomicStructure;

	/**
	 * symbol is the atomic symbol for the element.
	 */
	private String symbol;

	/**
	 * atomicNumber is the atomic number of the element.
	 */
	private byte atomicNumber;

	/**
	 * atomicMass is the atomic mass of the element in unified atomic mass unit or dalton (u or Da).
	 */
	private float atomicMass;

}
