package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: Proton
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Proton is a nucleon with positive electric charge of unit elementary charge and a mass slightly less than that of a
 * {@linkplain Neutron}.
 *
 * @author RandomCatGit
 */
public class Proton extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpQuark());
				particles.add(new UpQuark());
				particles.add(new DownQuark());
				return particles;
			}
		}.getParticles();
	}

}
