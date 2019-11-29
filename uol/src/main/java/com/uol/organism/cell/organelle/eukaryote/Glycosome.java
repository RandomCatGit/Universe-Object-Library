package com.uol.organism.cell.organelle.eukaryote;

import java.util.Arrays;

import com.uol.organism.biomolecule.protein.Protein;
import com.uol.organism.biomolecule.saccharide.Glycogen;
import com.uol.organism.cell.organelle.Organelle;

/*
 * RWO: Glycosome
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								30/01/2019
 */

/**
 * Glycosome is a membrane-enclosed organelle that contains the glycolytic enzymes.
 *
 * @author RandomCatGit
 */
public class Glycosome extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Glycosome
	 */
	public Glycosome() {
		super(Arrays.asList(new Glycogen(), new Protein()));
	}

}
