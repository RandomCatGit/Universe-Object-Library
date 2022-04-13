package com.uol.organism.tissue.plant.dermal;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.Phellem;
import com.uol.organism.cell.multi_cell.eukaryote.plant.Phelloderm;
import com.uol.organism.tissue.Tissue;

/*
 * RWO: Periderm
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								20/02/2020
 */

/**
 * Periderm is the secondary covering that forms on small woody stems and many non-woody plants, which is composed of
 * cork (phellem), the cork cambium (phellogen), and the phelloderm.
 *
 * @author RandomCatGit
 */
public class Periderm extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Periderm
	 */
	public Periderm() {
		super(Arrays.asList(new Phellem(), new Phelloderm()));
	}

}
