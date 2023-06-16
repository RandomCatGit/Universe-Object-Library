package com.uol.organism.cell.single_cell.prokaryote.archaebacteria;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.Flagellum;

/**
 * Pyrobaculum is rod-shaped and isolated from locations with high temperatures. It is Gram-negative and its cells are
 * surrounded by an S-layer of protein subunits.
 *
 * @author RandomCatGit
 */
public class Pyrobaculum extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Pyrobaculum
	 */
	public Pyrobaculum() {
		super(Arrays.asList(new Flagellum()));
	}

}
