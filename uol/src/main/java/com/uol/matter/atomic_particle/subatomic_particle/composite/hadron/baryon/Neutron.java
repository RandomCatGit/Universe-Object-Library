package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: Neutron
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * Neutron is a nucleon with no net electric charge and a mass slightly larger than that of a {@linkplain Proton}.
 *
 * @author RandomCatGit
 */
public final class Neutron extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Neutron
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Neutron
	 */
	public Neutron() {
		setSpin(1 / 2);
		setMass(0.93956564191f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new DownQuark()));
	}

}
