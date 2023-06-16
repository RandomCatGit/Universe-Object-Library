package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * TopAntiquark is the antiparticle of {@linkplain TopQuark}.
 *
 * @author RandomCatGit
 */
public class TopAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO TopAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO TopAntiquark
	 */
	public TopAntiquark() {
		setSpin(1 / 2);
		setMass(175f);
		setElectricCharge(-2 / 3);
	}
}
