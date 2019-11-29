package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/*
 * RWO: JPsiMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * JPsiMeson is a subatomic particle, a flavor-neutral meson consisting of a {@linkplain CharmQuark} and a
 * {@linkplain CharmAntiquark}.
 *
 * @author RandomCatGit
 */
public class JPsiMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO JPsiMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO JPsiMeson
	 */
	public JPsiMeson() {
		setSpin(1);
		setMass(3.096916f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new CharmQuark());
				particles.add(new CharmAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
