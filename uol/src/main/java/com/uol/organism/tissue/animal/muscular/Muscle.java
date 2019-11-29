package com.uol.organism.tissue.animal.muscular;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.MuscleCell;
import com.uol.organism.tissue.Tissue;

/*
 * RWO: Muscle
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								29/10/2019
 */

/**
 * Muscle is a soft tissue found in most animals. Muscle cells contain protein filaments of actin and myosin that slide
 * past one another, producing a contraction that changes both the length and the shape of the cell.
 *
 * @author RandomCatGit
 */
public class Muscle extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Muscle
	 */
	public Muscle() {
		super(Arrays.asList(new MuscleCell()));
	}

}
