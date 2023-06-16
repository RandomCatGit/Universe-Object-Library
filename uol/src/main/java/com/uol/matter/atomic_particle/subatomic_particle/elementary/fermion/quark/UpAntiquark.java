package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * UpAntiquark is the antiparticle of {@linkplain UpQuark}.
 *
 * @author RandomCatGit
 */
public class UpAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO UpAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO UpAntiquark
	 */
	public UpAntiquark() {
		setSpin(1 / 2);
		setMass(0.003f);
		setElectricCharge(-2 / 3);
	}
}
