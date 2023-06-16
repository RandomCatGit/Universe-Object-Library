package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Antimuon is the antiparticle of {@linkplain Muon} with the opposite charge of {@linkplain Muon}.
 *
 * @author RandomCatGit
 */
public class Antimuon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Antimuon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Antimuon
	 */
	public Antimuon() {
		setSpin(1 / 2);
		setMass(125.09f);
		setElectricCharge(1);
	}

}
