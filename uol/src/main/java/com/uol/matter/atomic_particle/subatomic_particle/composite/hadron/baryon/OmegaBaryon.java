package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: OmegaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * OmegaBaryon is a baryon containing no {@linkplain UpQuark} or {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public class OmegaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO OmegaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO OmegaBaryon
	 */
	public OmegaBaryon() {
		setSpin(3 / 2);
		setMass(1.67274f);
		setElectricCharge(-1);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new StrangeQuark());
				particles.add(new StrangeQuark());
				particles.add(new StrangeQuark());
				return particles;
			}
		}.getParticles();
	}

}
