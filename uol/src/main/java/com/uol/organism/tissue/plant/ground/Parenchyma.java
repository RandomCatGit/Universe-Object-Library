package com.uol.organism.tissue.plant.ground;

import java.util.Arrays;

import com.uol.organism.tissue.Tissue;

/*
 * RWO: Parenchyma
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								11/03/2022
 */

/**
 * Parenchyma is a versatile ground tissue that generally constitutes the "filler" tissue in soft parts of plants. It
 * forms, among other things, the cortex (outer region) and pith (central region) of stems, the cortex of roots, the
 * mesophyll of leaves, the pulp of fruits, and the endosperm of seeds.
 *
 * @author RandomCatGit
 */
public class Parenchyma extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StemCell
	 */
	public Parenchyma() {
		super(Arrays.asList(new com.uol.organism.cell.multi_cell.eukaryote.plant.Parenchyma()));
	}

}
