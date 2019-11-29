package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/*
 * RWO: CharmedEtaMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedEtaMeson is a form of quarkonium and is made of {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedEtaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedEtaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedEtaMeson
	 */
	public CharmedEtaMeson() {
		setSpin(0);
		setMass(2.9843f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new CharmQuark());
				particles.add(new CharmQuark());
				return particles;
			}
		}.getParticles();
	}

}
