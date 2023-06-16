package com.uol.matter.atomic_particle.subatomic_particle.elementary.boson.gauge;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * Gluon is an elementary particle that acts as the exchange particle (or gauge boson) for the strong force between
 * quarks.
 *
 * @author RandomCatGit
 */
public class Gluon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Gluon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Gluon
	 */
	public Gluon() {
		setSpin(1);
		setMass(0f);
		setElectricCharge(0);
	}

}
