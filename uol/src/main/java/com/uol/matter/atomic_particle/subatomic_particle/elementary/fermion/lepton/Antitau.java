package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Antitau is the antiparticle of {@linkplain Tau} with the opposite charge of {@linkplain Tau}.
 *
 * @author RandomCatGit
 */
public class Antitau extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Antitau
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Antitau
	 */
	public Antitau() {
		setSpin(1 / 2);
		setMass(1.7771f);
		setElectricCharge(1);
	}
}
