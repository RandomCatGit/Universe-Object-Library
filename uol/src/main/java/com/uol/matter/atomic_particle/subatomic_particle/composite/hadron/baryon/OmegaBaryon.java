package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * OmegaBaryon is a baryon containing no {@linkplain UpQuark} or {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public final class OmegaBaryon extends SubatomicParticle {

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
		setCompositeParticles(Arrays.asList(new StrangeQuark(), new StrangeQuark(), new StrangeQuark()));
	}

}
