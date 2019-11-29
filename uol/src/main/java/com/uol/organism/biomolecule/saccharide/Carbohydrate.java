package com.uol.organism.biomolecule.saccharide;

import com.uol.matter.molecule.Molecule;

/*
 * RWO: Carbohydrate
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								04/02/2019
 */

/**
 * Carbohydrate is a biomolecule consisting of carbon (C), hydrogen (H) and oxygen (O) atoms, usually with a
 * hydrogen–oxygen atom ratio of 2:1 (as in water) and thus with the empirical formula Cn(H2O)m (where m may be
 * different from n).
 *
 * @author RandomCatGit
 */
public class Carbohydrate extends Molecule {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Carbohydrate
	 */
	public Carbohydrate() {
		super("Cn(H2O)m", "");
	}

}
