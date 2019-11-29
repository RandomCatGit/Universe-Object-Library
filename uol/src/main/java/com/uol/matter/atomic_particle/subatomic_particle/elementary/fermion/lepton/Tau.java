package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: Tau
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * Tau is also called the tau lepton, tau particle, or tauon, is an elementary particle similar to the
 * {@linkplain Electron}.
 *
 * @author RandomCatGit
 */
public class Tau extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Tau
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Tau
	 */
	public Tau() {
		setSpin(1 / 2);
		setMass(1.7771f);
		setElectricCharge(-1);
	}
}
