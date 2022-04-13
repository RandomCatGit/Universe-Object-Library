package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.matter.molecule.carbon.OleicAcid;
import com.uol.matter.molecule.carbon.PalmiticAcid;
import com.uol.matter.molecule.carbon.StearicAcid;

/*
 * RWO: Cutin
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								20/02/2020
 */

/**
 * Cutin is one of two waxy polymers that are the main components of the plant cuticle, which covers all aerial surfaces
 * of plants.
 *
 * @author RandomCatGit
 */
public class Cutin extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Cutin
	 */
	public Cutin() {
		super(Arrays.asList(new PalmiticAcid(), new StearicAcid(), new OleicAcid()));
	}

}
