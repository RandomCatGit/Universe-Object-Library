package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/**
 * DMeson is the lightest particle containing {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class DMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DMeson
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public DMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("DMesons can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 1.86501f : 1.86982f);
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpAntiquark() : new DownAntiquark(), new CharmQuark()));
	}

}
