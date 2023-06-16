package com.uol.organism.tissue.plant.vascular;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.AlbuminousCell;
import com.uol.organism.cell.multi_cell.eukaryote.plant.BastFibre;
import com.uol.organism.cell.multi_cell.eukaryote.plant.Parenchyma;
import com.uol.organism.cell.multi_cell.eukaryote.plant.Sclereid;
import com.uol.organism.cell.multi_cell.eukaryote.plant.SieveTubeElement;
import com.uol.organism.tissue.Tissue;

/**
 * Phloem is the living tissue in vascular plants that transports the soluble organic compounds made during
 * photosynthesis and known as photosynthates, in particular the sugar sucrose, to parts of the plant where needed.
 *
 * @author RandomCatGit
 */
public class Phloem extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Phloem
	 */
	public Phloem() {
		super(Arrays.asList(new Parenchyma(), new SieveTubeElement(), new AlbuminousCell(), new BastFibre(), new Sclereid()));
	}

}
