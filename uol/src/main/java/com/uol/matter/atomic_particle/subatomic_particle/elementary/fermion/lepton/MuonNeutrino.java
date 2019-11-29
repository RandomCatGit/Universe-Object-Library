package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: MuonNeutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * MuonNeutrino is a lepton with no net electric charge.
 *
 * @author RandomCatGit
 */
public class MuonNeutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO MuonNeutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO MuonNeutrino
	 */
	public MuonNeutrino() {
		setSpin(1 / 2);
		setMass(0.0002f);
		setElectricCharge(0);
	}
}
