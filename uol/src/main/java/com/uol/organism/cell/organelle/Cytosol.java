package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.organism.biomolecule.amino_acid.AminoAcid;

/*
 * RWO: Cytosol
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								18/05/2019
 */

/**
 * Cytosol is also known as intracellular fluid (ICF) or cytoplasmic matrix, or groundplasm. It is the liquid found
 * inside cells and is separated into compartments by membranes.
 *
 * @author RandomCatGit
 */
public class Cytosol extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Cytosol
	 */
	public Cytosol() {
		super(Arrays.asList(new AminoAcid()));
	}

}
