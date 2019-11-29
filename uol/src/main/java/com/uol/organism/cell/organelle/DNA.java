package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.organism.biomolecule.nucleic_acid.DeoxyribonucleicAcid;

/*
 * RWO: DNA
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								18/05/2019
 */

/**
 * DNA is a molecule composed of two chains that coil around each other to form a double helix carrying the genetic
 * instructions used in the growth, development, functioning, and reproduction of all known organisms and many viruses.
 *
 * @author RandomCatGit
 */
public class DNA extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DNA
	 */
	public DNA() {
		super(Arrays.asList(new DeoxyribonucleicAcid()));
	}

}
