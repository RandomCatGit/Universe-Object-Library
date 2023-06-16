package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Positron or antielectron is the antiparticle of the {@linkplain Electron}.
 *
 * @author RandomCatGit
 */
public class Positron extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Positron
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Positron
	 */
	public Positron() {
		setSpin(1 / 2);
		setMass(0.000511f);
		setElectricCharge(1);
	}
}
