package com.uol.organism.cell.organelle.prokaryote;

import java.util.Arrays;

import com.uol.matter.molecule.iron.Magnetite;
import com.uol.organism.cell.organelle.Organelle;

/*
 * RWO: Magnetosome
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								30/01/2019
 */

/**
 * Magnetosome are membranous structures present in magnetotactic bacteria (MTB). They contain iron-rich magnetic
 * particles that are enclosed within a lipid bilayer membrane. Each magnetosome can often contain 15 to 20 magnetite
 * crystals that form a chain which acts like a compass needle to orient magnetotactic bacteria in geomagnetic fields,
 * thereby simplifying their search for their preferred microaerophilic environments.
 *
 * @author RandomCatGit
 */
public class Magnetosome extends Organelle {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Magnetosome
	 */
	public Magnetosome() {
		super(Arrays.asList(new Magnetite()));
	}

}
