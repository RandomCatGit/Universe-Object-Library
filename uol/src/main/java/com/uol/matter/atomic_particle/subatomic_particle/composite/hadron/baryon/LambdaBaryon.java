package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

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
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * LambdaBaryon is a subatomic hadron particle containing one {@linkplain UpQuark}, one {@linkplain DownQuark} and a
 * {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public final class LambdaBaryon extends SubatomicParticle {

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
		setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new StrangeQuark()));
	}

}
