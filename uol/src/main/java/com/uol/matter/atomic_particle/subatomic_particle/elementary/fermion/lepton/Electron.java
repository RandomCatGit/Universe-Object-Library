package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Electron is a subatomic particle whose electric charge is negative unit elementary charge.
 *
 * @author RandomCatGit
 */
public class Electron extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Electron
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Electron
	 */
	public Electron() {
		setSpin(1 / 2);
		setMass(0.000511f);
		setElectricCharge(-1);
	}

}
