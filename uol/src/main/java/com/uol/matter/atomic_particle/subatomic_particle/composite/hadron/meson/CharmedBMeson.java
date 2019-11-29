package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/*
 * RWO: CharmedBMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedBMeson is meson composed of a {@linkplain BottomAntiquark} and a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedBMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedBMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedBMeson
	 */
	public CharmedBMeson() {
		setSpin(0);
		setMass(6.2761f);
		setElectricCharge(1);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new CharmQuark());
				particles.add(new BottomAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
