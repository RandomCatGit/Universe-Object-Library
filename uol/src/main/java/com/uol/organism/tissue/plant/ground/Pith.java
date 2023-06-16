package com.uol.organism.tissue.plant.ground;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.Parenchyma;
import com.uol.organism.tissue.Tissue;

/**
 * Pith is a tissue in the stems of vascular plants. Pith is composed of soft, spongy parenchyma cells, which in some
 * cases can store starch.
 *
 * @author RandomCatGit
 */
public class Pith extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StemCell
	 */
	public Pith() {
		super(Arrays.asList(new Parenchyma()));
	}

}
