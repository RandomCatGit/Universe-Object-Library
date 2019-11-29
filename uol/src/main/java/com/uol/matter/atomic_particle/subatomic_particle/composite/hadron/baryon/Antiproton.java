package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/*
 * RWO: Antiproton
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Antiproton is the antiparticle of {@linkplain Proton}. Antiprotons are stable, but they are typically short-lived,
 * since any collision with a {@linkplain Proton} will cause both particles to be annihilated in a burst of energy.
 *
 * @author RandomCatGit
 */
public class Antiproton extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Antiproton
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Antiproton
	 */
	public Antiproton() {
		setSpin(1 / 2);
		setMass(0.9382720871f);
		setElectricCharge(-1);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpAntiquark());
				particles.add(new UpAntiquark());
				particles.add(new DownAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
