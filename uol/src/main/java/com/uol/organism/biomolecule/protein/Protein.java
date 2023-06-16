package com.uol.organism.biomolecule.protein;

import java.util.Arrays;

import com.uol.matter.molecule.Molecule;
import com.uol.organism.biomolecule.amino_acid.AminoAcid;

/**
 * Protein is a biomolecule consisting of one or more long chains of amino acid residues. Proteins perform a vast array
 * of functions within organisms, including catalysing metabolic reactions, DNA replication, responding to stimuli,
 * providing structure to cells and organisms, and transporting molecules from one location to another.
 *
 * @author RandomCatGit
 */
public class Protein extends Molecule {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Protein
	 */
	public Protein() {
		super(Arrays.asList(new AminoAcid()));
	}

}
