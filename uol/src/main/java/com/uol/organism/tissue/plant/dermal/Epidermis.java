package com.uol.organism.tissue.plant.dermal;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.plant.Cuticle;
import com.uol.organism.cell.multi_cell.eukaryote.plant.GuardCell;
import com.uol.organism.tissue.Tissue;

/**
 * Epidermis is a single layer of cells that covers the leaves, flowers, roots and stems of plants. It forms a boundary
 * between the plant and the external environment. The epidermis serves several functions: it protects against water
 * loss, regulates gas exchange, secretes metabolic compounds, and (especially in roots) absorbs water and mineral
 * nutrients.
 *
 * @author RandomCatGit
 */
public class Epidermis extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Epidermis
	 */
	public Epidermis() {
		super(Arrays.asList(new Cuticle(), new GuardCell()));
	}

}
