package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * BMeson is meson composed of a {@linkplain BottomAntiquark} and either an {@linkplain UpQuark} or
 * {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public final class BMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BMeson
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public BMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("BMesons can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 5.27977f : 5.27944f);
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new DownQuark() : new UpQuark(), new BottomAntiquark()));
	}

}
