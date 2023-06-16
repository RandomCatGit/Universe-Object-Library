package com.uol.organism.cell.multi_cell.eukaryote.plant;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.Suberin;

/**
 * Phellem or Cork is composed of suberin, a hydrophobic substance. Because of its impermeable, buoyant, elastic, and
 * fire retardant properties, it is used in a variety of products, the most common of which is wine stoppers.
 *
 * @author RandomCatGit
 */
public class Phellem extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Phellem
	 */
	public Phellem() {
		super(Arrays.asList(new Suberin()));
	}

}
