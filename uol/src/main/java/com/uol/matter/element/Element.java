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
 * RandomCatGit					Added valence property					29/11/2019
 * RandomCatGit					Changed elementary class to final		13/04/2022
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
public abstract class Element extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP Element
	 */
	private static final long serialVersionUID = 1L;

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
	 * atomicMass is the atomic mass of the element in unified atomic mass unit or Dalton (u or Da).
	 */
	private float atomicMass;

	/**
	 * valence is the atomic valence of the element.
	 */
	private byte valence;
}
