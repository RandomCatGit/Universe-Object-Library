package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: DownAntiquark
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * DownAntiquark is the antiparticle of {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public class DownAntiquark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DownAntiquark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DownAntiquark
	 */
	public DownAntiquark() {
		setSpin(1 / 2);
		setMass(0.006f);
		setElectricCharge(1 / 3);
	}
}
