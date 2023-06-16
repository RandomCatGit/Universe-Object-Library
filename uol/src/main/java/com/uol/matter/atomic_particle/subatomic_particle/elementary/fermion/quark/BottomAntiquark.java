package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * BottomAntiquark is the antiparticle of {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class BottomAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BottomAntiquark
	 */
	public BottomAntiquark() {
		setSpin(1 / 2);
		setMass(4.3f);
		setElectricCharge(1 / 3);
	}
}
