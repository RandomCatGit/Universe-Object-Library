package com.uol.organism.biomolecule.nucleic_acid;

import java.util.Arrays;

import com.uol.matter.molecule.carbon.Adenine;
import com.uol.matter.molecule.carbon.Cytosine;
import com.uol.matter.molecule.carbon.Deoxyribose;
import com.uol.matter.molecule.carbon.Guanine;
import com.uol.matter.molecule.carbon.Thymine;
import com.uol.matter.molecule.Molecule;

/**
 * DeoxyribonucleicAcid or DNA is a molecule composed of two chains that coil around each other to form a double helix
 * carrying the genetic instructions used in the growth, development, functioning, and reproduction of all known living
 * organisms and many viruses.
 *
 * @author RandomCatGit
 */
public class DeoxyribonucleicAcid extends Molecule {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DeoxyribonucleicAcid
	 */
	public DeoxyribonucleicAcid() {
		super(Arrays.asList(new Adenine(), new Thymine(), new Guanine(), new Cytosine(), new Deoxyribose()));
	}

}
