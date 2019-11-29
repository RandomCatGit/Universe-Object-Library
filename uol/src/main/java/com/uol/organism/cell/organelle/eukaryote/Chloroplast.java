package com.uol.organism.cell.organelle.eukaryote;

import java.util.Arrays;

import com.uol.matter.molecule.carbon.AdenosineTriphosphate;
import com.uol.matter.molecule.carbon.Chlorophyll;
import com.uol.organism.cell.organelle.Organelle;

/*
 * RWO: Chloroplast
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/01/2019
 */

/**
 * Chloroplast is an organelle that contains {@linkplain Chlorophyll} which converts light into energy-storing molecules
 * {@linkplain AdenosineTriphosphate} (ATP) and {@linkplain NicotinamideAdenineDinucleotidePhosphate} (NADPH).
 *
 * @author RandomCatGit
 */
public class Chloroplast extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Chloroplast
	 */
	public Chloroplast() {
		super(Arrays.asList(new Chlorophyll()));
	}

}
