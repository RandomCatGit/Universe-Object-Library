package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: KShort
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * KShort is short-lived neutral {@linkplain Kaon} that decays primarily into two pions.
 *
 * @author RandomCatGit
 */
public class KShort extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO KShort
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO KShort
	 */
	public KShort() {
		setSpin(0);
		setMass(0.497624f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new DownQuark());
				particles.add(new StrangeAntiquark());
				particles.add(new StrangeQuark());
				particles.add(new DownAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
