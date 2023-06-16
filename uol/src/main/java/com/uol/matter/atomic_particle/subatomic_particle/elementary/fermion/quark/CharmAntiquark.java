package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * CharmAntiquark is the antiparticle of {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class CharmAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmAntiquark
	 */
	public CharmAntiquark() {
		setSpin(1 / 2);
		setMass(1.3f);
		setElectricCharge(-2 / 3);
	}
}
