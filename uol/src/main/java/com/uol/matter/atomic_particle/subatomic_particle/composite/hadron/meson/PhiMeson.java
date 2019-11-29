package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: PhiMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * PhiMeson is a vector meson formed of a {@linkplain StrangeQuark} and a {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public class PhiMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO PhiMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO PhiMeson
	 */
	public PhiMeson() {
		setSpin(0);
		setMass(1.019465f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new StrangeQuark());
				particles.add(new StrangeAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
