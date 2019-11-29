package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: TauAntineutrino
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * TauAntineutrino is the antiparticle of {@linkplain TauNeutrino}.
 *
 * @author RandomCatGit
 */
public class TauAntineutrino extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO TauAntineutrino
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO TauAntineutrino
	 */
	public TauAntineutrino() {
		setSpin(1 / 2);
		setMass(0.02f);
		setElectricCharge(0);
	}
}
