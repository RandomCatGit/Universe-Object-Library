package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: Neutron
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Neutron is a nucleon with no net electric charge and a mass slightly larger than that of a {@linkplain Proton}.
 *
 * @author RandomCatGit
 */
public class Neutron extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpQuark());
				particles.add(new DownQuark());
				particles.add(new DownQuark());
				return particles;
			}
		}.getParticles();
	}

}
