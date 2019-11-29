package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.organism.biomolecule.nucleic_acid.RibonucleicAcid;

/*
 * RWO: RNA
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								18/05/2019
 */

/**
 * RNA is a polymeric molecule essential in various biological roles in coding, decoding, regulation and expression of
 * genes.
 *
 * @author RandomCatGit
 */
public class RNA extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO RNA
	 */
	public RNA() {
		super(Arrays.asList(new RibonucleicAcid()));
	}

}
