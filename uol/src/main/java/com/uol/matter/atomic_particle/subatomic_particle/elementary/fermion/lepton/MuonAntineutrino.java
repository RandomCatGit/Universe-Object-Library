package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: MuonAntineutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * MuonAntineutrino is the antiparticle of {@linkplain MuonNeutrino}.
 *
 * @author RandomCatGit
 */
public class MuonAntineutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO MuonAntineutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO MuonAntineutrino
	 */
	public MuonAntineutrino() {
		setSpin(1 / 2);
		setMass(0.0002f);
		setElectricCharge(0);
	}
}
