package com.uol.organism.cell.multi_cell.eukaryote.animal;

import com.uol.organism.cell.Cell;

import lombok.Getter;

/*
 * RWO: MuscleCell
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								29/10/2019
 */

/**
 * MuscleCell is a soft tissue found in most animals. MuscleCell cells contain protein filaments of actin and myosin
 * that slide past one another, producing a contraction that changes both the length and the shape of the cell.
 *
 * @author RandomCatGit
 */
@Getter
public class MuscleCell extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO MuscleCell
	 */
	public MuscleCell() {
		super(null); // TODO add constituent
	}

}
