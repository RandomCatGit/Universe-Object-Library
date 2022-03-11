package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.TopQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: TopLambdaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * TopLambdaBaryon is a a subatomic hadron particle containing one {@linkplain UpQuark}, one {@linkplain DownQuark} and
 * a {@linkplain TopQuark}.
 *
 * @author RandomCatGit
 */
public final class TopLambdaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO TopLambdaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO TopLambdaBaryon
	 */
	public TopLambdaBaryon() {
		setSpin(1 / 2);
		setMass(Float.NaN); // Particle unobserved, because the top-quark decays before it hadronizes.
		setElectricCharge(1);
		setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new TopQuark()));
	}
}
