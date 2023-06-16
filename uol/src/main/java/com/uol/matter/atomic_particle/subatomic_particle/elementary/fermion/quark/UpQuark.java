package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * UpQuark is also known as u quark, is the lightest of all quarks.
 *
 * @author RandomCatGit
 */
public class UpQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO UpQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO UpQuark
	 */
	public UpQuark() {
		setSpin(1 / 2);
		setMass(0.003f);
		setElectricCharge(2 / 3);
	}
}
