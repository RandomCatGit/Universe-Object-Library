package com.uol.organism.cell.single_cell.prokaryote.bacteria;

import java.util.Arrays;

import com.uol.organism.cell.Cell;
import com.uol.organism.cell.organelle.DNA;
import com.uol.organism.cell.organelle.Flagellum;
import com.uol.organism.cell.organelle.RNA;
import com.uol.organism.cell.organelle.Ribosome;
import com.uol.organism.cell.organelle.prokaryote.Pilus;

/**
 * EscherichiaColi also known as E. coli is a Gram-negative, facultative anaerobic, rod-shaped, coliform bacterium of
 * the genus Escherichia that is commonly found in the lower intestine of warm-blooded organisms (endotherms).
 *
 * @author RandomCatGit
 */
public class EscherichiaColi extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO EscherichiaColi
	 */
	public EscherichiaColi() {
		super(Arrays.asList(new DNA(), new RNA(), new Ribosome(), new Flagellum(), new Pilus()));
	}

}
