package com.uol.matter.atomic_particle.subatomic_particle.elementary.boson.scalar;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/*
 * RWO: HiggsBoson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								23/12/2018
 */

/**
 * HiggsBoson is an elementary particle in the Standard Model of particle physics, produced by the quantum excitation of
 * the Higgs field, one of the fields in particle physics theory.
 *
 * @author RandomCatGit
 */
public class HiggsBoson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO HiggsBoson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO HiggsBoson
	 */
	public HiggsBoson() {
		setSpin(0);
		setMass(125.09f);
		setElectricCharge(0);
	}

}
