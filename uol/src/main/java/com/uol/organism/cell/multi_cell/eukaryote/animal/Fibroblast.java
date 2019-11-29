package com.uol.organism.cell.multi_cell.eukaryote.animal;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.eukaryote.EndoplasmicReticulum;
import com.uol.organism.cell.organelle.eukaryote.Nucleolus;
import com.uol.organism.cell.organelle.eukaryote.Nucleus;

/*
 * RWO: Fibroblast
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/10/2019
 */

/**
 * Fibroblast is a type of biological cell that synthesizes the extracellular matrix and collagen, produces the
 * structural framework (stroma) for animal tissues, and plays a critical role in wound healing. Fibroblasts are the
 * most common cells of connective tissue in animals.
 *
 * @author RandomCatGit
 */
public class Fibroblast extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Fibroblast
	 */
	public Fibroblast() {
		super(Arrays.asList(new Nucleus(), new Nucleolus(), new EndoplasmicReticulum()));
	}

}
