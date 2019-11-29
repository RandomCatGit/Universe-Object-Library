package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: TopQuark
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * TopQuark is also known as the t quark or truth quark, is the most massive of all observed elementary particles.
 *
 * @author RandomCatGit
 */
public class TopQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO TopQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO TopQuark
	 */
	public TopQuark() {
		setSpin(1 / 2);
		setMass(175f);
		setElectricCharge(2 / 3);
	}
}
