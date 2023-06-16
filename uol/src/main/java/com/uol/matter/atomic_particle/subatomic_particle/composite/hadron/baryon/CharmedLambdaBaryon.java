package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * CharmedLambdaBaryon is a a subatomic hadron particle containing one {@linkplain UpQuark}, one {@linkplain DownQuark}
 * and a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedLambdaBaryon extends SubatomicParticle {

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
		setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new CharmQuark()));
	}

}
