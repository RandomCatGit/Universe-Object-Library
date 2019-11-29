package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: BottomOmegaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * BottomOmegaBaryon is an {@linkplain OmegaBaryon} with a {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class BottomOmegaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomOmegaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO BottomOmegaBaryon
	 */
	public BottomOmegaBaryon() {
		setSpin(1 / 2);
		setMass(6.0612f);
		setElectricCharge(-1);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new StrangeQuark());
				particles.add(new StrangeQuark());
				particles.add(new BottomQuark());
				return particles;
			}
		}.getParticles();
	}

}
