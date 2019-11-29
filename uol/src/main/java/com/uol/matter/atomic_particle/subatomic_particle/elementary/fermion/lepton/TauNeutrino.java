package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: TauNeutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * TauNeutrino is also known as tauon neutrino, a subatomic elementary particle which has no net electric charge.
 *
 * @author RandomCatGit
 */
public class TauNeutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO TauNeutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO TauNeutrino
	 */
	public TauNeutrino() {
		setSpin(1 / 2);
		setMass(0.02f);
		setElectricCharge(0);
	}
}
