package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: CharmQuark
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * CharmQuark is also known as c quark, is the third most massive of all quarks.
 *
 * @author RandomCatGit
 */
public class CharmQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmQuark
	 */
	public CharmQuark() {
		setSpin(1 / 2);
		setMass(1.3f);
		setElectricCharge(2 / 3);
	}
}
