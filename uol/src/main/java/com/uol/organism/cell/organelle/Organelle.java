package com.uol.organism.cell.organelle;

import java.util.List;

import com.uol.UniverseObjectLibrary;
import com.uol.matter.molecule.Molecule;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * RWP: Organelle
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWP								23/01/2018
 */

/**
 * Organelle is the RWP class on common properties of all Organelles.
 *
 * @author RandomCatGit
 */
@Getter
@Setter(AccessLevel.NONE)
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Organelle extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP Organelle
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * molecules is the list of molecules present in the organelle.
	 */
	private List<Molecule> molecules;
}