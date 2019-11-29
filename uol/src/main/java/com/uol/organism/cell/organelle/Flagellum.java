package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.organism.biomolecule.protein.Flagellin;
import com.uol.organism.cell.organelle.Organelle;

/*
 * RWO: Flagellum
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								30/01/2019
 */

/**
 * Flagellum is a lash-like appendage that protrudes from the cell body of certain bacteria and eukaryote cells termed
 * as flagellates.
 *
 * @author RandomCatGit
 */
public class Flagellum extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Flagellum
	 */
	public Flagellum() {
		super(Arrays.asList(new Flagellin()));
	}

}
