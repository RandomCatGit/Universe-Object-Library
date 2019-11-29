package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: ElectronAntineutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * ElectronAntineutrino is the antiparticle of {@linkplain ElectronNeutrino}.
 *
 * @author RandomCatGit
 */
public class ElectronAntineutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO ElectronAntineutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO ElectronAntineutrino
	 */
	public ElectronAntineutrino() {
		setSpin(1 / 2);
		setMass(0.00000000012f);
		setElectricCharge(0);
	}
}
