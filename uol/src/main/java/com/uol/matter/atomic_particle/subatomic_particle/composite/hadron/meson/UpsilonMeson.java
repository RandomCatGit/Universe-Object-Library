package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;

/*
 * RWO: UpsilonMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * UpsilonMeson is a quarkonium state (i.e. flavourless meson) formed from a {@linkplain BottomQuark} and its
 * antiparticle.
 *
 * @author RandomCatGit
 */
public class UpsilonMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO UpsilonMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO UpsilonMeson
	 */
	public UpsilonMeson() {
		setSpin(1);
		setMass(9.46056f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new BottomQuark());
				particles.add(new BottomAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
