package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;

/*
 * RWO: StrangeDMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * StrangeDMeson is a {@linkplain DMeson} with an {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public class StrangeDMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO StrangeDMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StrangeDMeson
	 * 
	 * @param charge can take values -1 or 1
	 * @throws IllegalArgumentException
	 */
	public StrangeDMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) != 1) {
			throw new IllegalArgumentException("StrangeDMesons can contain only -1 or 1 charge");
		}
		setSpin(0);
		setMass(1.9688f);
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new CharmQuark());
				particles.add(new StrangeAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
