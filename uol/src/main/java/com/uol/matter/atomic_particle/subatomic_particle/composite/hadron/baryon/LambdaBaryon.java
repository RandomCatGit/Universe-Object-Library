package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: LambdaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * LambdaBaryon is a subatomic hadron particle containing one {@linkplain UpQuark}, one {@linkplain DownQuark} and a
 * {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public class LambdaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO LambdaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO LambdaBaryon
	 */
	public LambdaBaryon() {
		setSpin(1 / 2);
		setMass(1.115689f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpQuark());
				particles.add(new DownQuark());
				particles.add(new StrangeQuark());
				return particles;
			}
		}.getParticles();
	}

}
