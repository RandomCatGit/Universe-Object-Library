package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Muon is an elementary particle similar to the {@linkplain Electron} but with a much greater mass.
 *
 * @author RandomCatGit
 */
public class Muon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Muon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Muon
	 */
	public Muon() {
		setSpin(1 / 2);
		setMass(125.09f);
		setElectricCharge(-1);
	}
}
