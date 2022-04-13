package com.uol.organism.cell.organelle;

import java.util.Arrays;

import com.uol.matter.molecule.carbon.Glycerol;

/*
 * RWO: Suberin
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								20/02/2020
 */

/**
 * Suberin is a complex polyester biopolymer, is lipophilic, and composed of long chain fatty acids called suberin
 * acids, and glycerol.
 *
 * @author RandomCatGit
 */
public class Suberin extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Suberin
	 */
	public Suberin() {
		super(Arrays.asList(new Glycerol()));
	}

}
