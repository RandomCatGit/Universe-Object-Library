package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * DownQuark is also known as d quark, is the second-lightest of all quarks.
 *
 * @author RandomCatGit
 */
public class DownQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DownQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DownQuark
	 */
	public DownQuark() {
		setSpin(1 / 2);
		setMass(0.006f);
		setElectricCharge(-1 / 3);
	}
}
