package com.uol.matter.atomic_particle.subatomic_particle.elementary.boson.gauge;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * WBoson is known as weak or intermediate vector bosons. They have either a positive or negative unit electric charge
 * and are each other's antiparticles.
 *
 * @author RandomCatGit
 */
public class WBoson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO WBoson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO WBoson
	 *
	 * @param charge can take values -1 or 1
	 */
	public WBoson(int charge) {
		if (Math.abs(charge) != 1) {
			throw new IllegalArgumentException("WBoson can contain only -1 or 1 charge");
		}
		setSpin(1);
		setMass(80.4f);
		setElectricCharge(charge);
	}

}
