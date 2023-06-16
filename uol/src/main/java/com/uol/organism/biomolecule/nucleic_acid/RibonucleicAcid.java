package com.uol.organism.biomolecule.nucleic_acid;

import java.util.Arrays;

import com.uol.matter.molecule.Molecule;
import com.uol.matter.molecule.carbon.Adenine;
import com.uol.matter.molecule.carbon.Cytosine;
import com.uol.matter.molecule.carbon.Guanine;
import com.uol.matter.molecule.carbon.Ribose;
import com.uol.matter.molecule.carbon.Uracil;

/**
 * RibonucleicAcid or RNA is a polymeric molecule essential in various biological roles in coding, decoding, regulation
 * and expression of genes.
 *
 * @author RandomCatGit
 */
public class RibonucleicAcid extends Molecule {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO RibonucleicAcid
	 */
	public RibonucleicAcid() {
		super(Arrays.asList(new Adenine(), new Uracil(), new Guanine(), new Cytosine(), new Ribose()));
	}

}
