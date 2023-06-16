package com.uol.organism.tissue.plant.ground;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.BastFibre;
import com.uol.organism.cell.multi_cell.eukaryote.plant.Sclereid;
import com.uol.organism.tissue.Tissue;

/**
 * Sclerenchyma is the tissue which makes the plant hard and stiff. Sclerenchyma is the supporting tissue in plants.
 *
 * @author RandomCatGit
 */
public class Sclerenchyma extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StemCell
	 */
	public Sclerenchyma() {
		super(Arrays.asList(new BastFibre(), new Sclereid())); // CONT https://en.wikipedia.org/wiki/Meristem#Primary_meristems
	}

}
