package com.uol.organism.biomolecule.protein;

import java.util.Arrays;

import com.uol.matter.molecule.Molecule;

/*
 * RWO: Tubulin
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								09/02/2019
 */

/**
 * Tubulin in molecular biology can refer either to the tubulin protein superfamily of globular proteins, or one of the
 * member proteins of that superfamily. α- and β-tubulins polymerize into microtubules, a major component of the
 * eukaryotic cytoskeleton.
 *
 * @author RandomCatGit
 */
public class Tubulin extends Molecule {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Tubulin
	 */
	public Tubulin() {
		super(Arrays.asList(new Protein()));
	}

}
