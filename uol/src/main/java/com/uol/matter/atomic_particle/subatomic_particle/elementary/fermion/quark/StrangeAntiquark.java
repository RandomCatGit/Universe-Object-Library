package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * StrangeAntiquark is the antiparticle of {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public class StrangeAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO StrangeAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StrangeAntiquark
	 */
	public StrangeAntiquark() {
		setSpin(1 / 2);
		setMass(0.1f);
		setElectricCharge(1 / 3);
	}
}
