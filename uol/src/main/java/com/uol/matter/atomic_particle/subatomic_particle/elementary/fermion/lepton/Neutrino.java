package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: Neutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * Neutrino is a fermion that interacts only via the weak subatomic force and gravity.
 *
 * @author RandomCatGit
 */
public class Neutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Neutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Neutrino
	 */
	public Neutrino() {
		setSpin(1 / 2);
		setMass(0.00000000012f);
		setElectricCharge(0);
	}
}
