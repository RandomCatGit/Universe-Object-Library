package com.uol.organism.cell.multi_cell.eukaryote.plant;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.eukaryote.Chloroplast;

/**
 * GuardCell are specialized plant cells in the epidermis of leaves, stems and other organs that are used to control gas
 * exchange. They are produced in pairs with a gap between them that forms a stomatal pore.
 *
 * @author RandomCatGit
 */
public class GuardCell extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO GuardCell
	 */
	public GuardCell() {
		super(Arrays.asList(new Chloroplast()));
	}

}
