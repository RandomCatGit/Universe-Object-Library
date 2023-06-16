package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * RhoMeson is a short-lived hadronic particle that is an isospin triplet. Along with {@linkplain Pion} and
 * {@linkplain OmegaMeson}, the rho meson carries the nuclear force within the atomic nucleus.
 *
 * @author RandomCatGit
 */
public final class RhoMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO RhoMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO RhoMeson
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public RhoMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("RhoMesons can contain only -1, 0 or 1 charge");
		}
		setSpin(1);
		setMass(charge == 0 ? 0.77583f : 0.7758f);
		setElectricCharge(charge);
		if (charge == 0) {
			setCompositeParticles(Arrays.asList(new UpQuark(), new UpAntiquark(), new DownQuark(), new DownAntiquark()));
		} else {
			setCompositeParticles(Arrays.asList(new UpQuark(), new DownAntiquark()));
		}
	}

}
