package com.uol.organism.cell.multi_cell.eukaryote.animal;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.eukaryote.Nucleus;

/*
 * RWO: EpithelialCell
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								22/10/2019
 */

/**
 * EpithelialCell is the building block of Epithelial tissue.
 *
 * @author RandomCatGit
 */
public class EpithelialCell extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO EpithelialCell
	 */
	public EpithelialCell() {
		super(Arrays.asList(new Nucleus()));
	}

}
