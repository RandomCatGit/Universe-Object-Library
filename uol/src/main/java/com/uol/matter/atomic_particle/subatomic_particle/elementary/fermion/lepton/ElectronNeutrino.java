package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: ElectronNeutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * ElectronNeutrino is a subatomic lepton elementary particle which has no net electric charge.
 *
 * @author RandomCatGit
 */
public class ElectronNeutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO ElectronNeutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO ElectronNeutrino
	 */
	public ElectronNeutrino() {
		setSpin(1 / 2);
		setMass(0.00000000012f);
		setElectricCharge(0);
	}
}
