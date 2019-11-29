package com.uol.matter.atomic_particle.subatomic_particle.elementary.boson.gauge;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: Photon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * Photon is a type of elementary particle, the quantum of the electromagnetic field including electromagnetic radiation
 * such as light, and the force carrier for the electromagnetic force (even when static via virtual particles). The
 * photon has zero rest mass and always moves at the speed of light within a vacuum.
 *
 * @author RandomCatGit
 */
public class Photon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Photon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Photon
	 */
	public Photon() {
		setSpin(1);
		setMass(0f);
		setElectricCharge(0);
	}

}
