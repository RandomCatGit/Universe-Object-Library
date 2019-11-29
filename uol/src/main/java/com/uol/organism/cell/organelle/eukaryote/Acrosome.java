package com.uol.organism.cell.organelle.eukaryote;

import java.util.Arrays;

import com.uol.matter.molecule.carbon.Acrosin;
import com.uol.matter.molecule.carbon.Hyaluronidase;
import com.uol.organism.cell.organelle.Organelle;

/*
 * RWO: Acrosome
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								30/01/2019
 */

/**
 * Acrosome is an organelle that develops over the anterior half of the head in the spermatozoa (sperm cells) of many
 * animals including humans.
 *
 * @author RandomCatGit
 */
public class Acrosome extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Acrosome
	 */
	public Acrosome() {
		super(Arrays.asList(new Hyaluronidase(), new Acrosin()));
	}

}
