package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: StrangeQuark
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * StrangeQuark is also known as s quark, is the third lightest of all quarks.
 *
 * @author RandomCatGit
 */
public class StrangeQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO StrangeQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StrangeQuark
	 */
	public StrangeQuark() {
		setSpin(1 / 2);
		setMass(0.1f);
		setElectricCharge(-1 / 3);
	}
}
