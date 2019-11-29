package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: CharmedLambdaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedLambdaBaryon is a a subatomic hadron particle containing one {@linkplain UpQuark}, one {@linkplain DownQuark}
 * and a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedLambdaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedLambdaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedLambdaBaryon
	 */
	public CharmedLambdaBaryon() {
		setSpin(1 / 2);
		setMass(2.2866f);
		setElectricCharge(1);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpQuark());
				particles.add(new DownQuark());
				particles.add(new CharmQuark());
				return particles;
			}
		}.getParticles();
	}

}
