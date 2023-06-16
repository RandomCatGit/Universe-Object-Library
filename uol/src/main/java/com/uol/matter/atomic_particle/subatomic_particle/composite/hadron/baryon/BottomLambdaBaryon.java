package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * BottomLambdaBaryon is a a subatomic hadron particle containing one {@linkplain UpQuark}, {@linkplain DownQuark} and a
 * {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public final class BottomLambdaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomLambdaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO BottomLambdaBaryon
	 */
	public BottomLambdaBaryon() {
		setSpin(1 / 2);
		setMass(5.6218f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new BottomQuark()));
	}

}
