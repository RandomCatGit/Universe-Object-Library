package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * Proton is a nucleon with positive electric charge of unit elementary charge and a mass slightly less than that of a
 * {@linkplain Neutron}.
 *
 * @author RandomCatGit
 */
public final class Proton extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Proton
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Proton
	 */
	public Proton() {
		setSpin(1 / 2);
		setMass(0.9382720871f);
		setElectricCharge(1);
		setCompositeParticles(Arrays.asList(new UpQuark(), new UpQuark(), new DownQuark()));
	}

}
