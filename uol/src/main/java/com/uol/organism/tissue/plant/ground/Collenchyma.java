package com.uol.organism.tissue.plant.ground;

import java.util.Collections;

import com.uol.organism.tissue.Tissue;

/**
 * Collenchyma is composed of elongated cells with irregularly thickened walls. They provide structural support,
 * particularly in growing shoots and leaves.
 *
 * @author RandomCatGit
 */
public class Collenchyma extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StemCell
	 */
	public Collenchyma() {
		super(Collections.singletonList(new com.uol.organism.cell.multi_cell.eukaryote.plant.Collenchyma()));
	}

}
