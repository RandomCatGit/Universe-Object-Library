package com.uol.organism.tissue.plant.vascular;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.Parenchyma;
import com.uol.organism.cell.multi_cell.eukaryote.plant.Tracheid;
import com.uol.organism.cell.multi_cell.eukaryote.plant.VesselElement;
import com.uol.organism.tissue.Tissue;

/**
 * Xylum transports water from roots to stems and leaves, but it also transports nutrients. An example of Xylum tissue
 * is wood.
 *
 * @author RandomCatGit
 */
public class Xylum extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Xylum
	 */
	public Xylum() {
		super(Arrays.asList(new Tracheid(), new VesselElement(), new Parenchyma()));
	}

}
