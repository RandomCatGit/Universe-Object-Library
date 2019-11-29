package com.uol.matter.atomic_particle.subatomic_particle.elementary.boson.gauge;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: ZBoson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * ZBoson is known as weak or intermediate vector bosons. The Z bosons are named after their Zero electric charge.
 *
 * @author RandomCatGit
 */
public class ZBoson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO ZBoson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO ZBoson
	 */
	public ZBoson() {
		setSpin(1);
		setMass(91.187f);
		setElectricCharge(0);
	}
}
