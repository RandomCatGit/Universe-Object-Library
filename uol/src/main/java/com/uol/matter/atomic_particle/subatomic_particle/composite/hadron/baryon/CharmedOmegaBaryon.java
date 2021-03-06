package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: CharmedOmegaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedOmegaBaryon is an {@linkplain OmegaBaryon} with a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedOmegaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedOmegaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedOmegaBaryon
	 */
	public CharmedOmegaBaryon() {
		setSpin(1 / 2);
		setMass(2.7001f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new StrangeQuark());
				particles.add(new StrangeQuark());
				particles.add(new CharmQuark());
				return particles;
			}
		}.getParticles();
	}

}
