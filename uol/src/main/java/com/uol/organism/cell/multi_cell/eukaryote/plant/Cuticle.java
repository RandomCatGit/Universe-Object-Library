package com.uol.organism.cell.multi_cell.eukaryote.plant;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.Cutan;
import com.uol.organism.cell.organelle.Cutin;

/*
 * RWO: Cuticle
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								20/02/2020
 */

/**
 * Cuticle is a protecting film covering the epidermis of leaves, young shoots and other aerial plant organs without
 * periderm. It consists of lipid and hydrocarbon polymers impregnated with wax, and is synthesized exclusively by the
 * epidermal cells.
 *
 * @author RandomCatGit
 */
public class Cuticle extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Cuticle
	 */
	public Cuticle() {
		super(Arrays.asList(new Cutin(), new Cutan()));
	}

}
