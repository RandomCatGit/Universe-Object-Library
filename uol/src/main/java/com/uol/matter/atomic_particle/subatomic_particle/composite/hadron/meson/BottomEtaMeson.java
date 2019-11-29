package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;

/*
 * RWO: BottomEtaMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * BottomEtaMeson is a form of quarkonium and is made of {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class BottomEtaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomEtaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO BottomEtaMeson
	 */
	public BottomEtaMeson() {
		setSpin(0);
		setMass(9.4012f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new BottomQuark());
				particles.add(new BottomQuark());
				return particles;
			}
		}.getParticles();
	}

}
