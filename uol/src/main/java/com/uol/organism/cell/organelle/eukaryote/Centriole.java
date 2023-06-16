package com.uol.organism.cell.organelle.eukaryote;

import java.util.Arrays;

import com.uol.organism.biomolecule.protein.Tubulin;
import com.uol.organism.cell.organelle.Organelle;

/**
 * Centriole is a cylindrical organelle composed mainly of a protein called tubulin.
 *
 * @author RandomCatGit
 */
public class Centriole extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Centriole
	 */
	public Centriole() {
		super(Arrays.asList(new Tubulin()));
	}

}
