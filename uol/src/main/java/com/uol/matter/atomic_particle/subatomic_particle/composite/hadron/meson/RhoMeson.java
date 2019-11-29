package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: RhoMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * RhoMeson is a short-lived hadronic particle that is an isospin triplet. Along with {@linkplain Pion} and
 * {@linkplain OmegaMeson}, the rho meson carries the nuclear force within the atomic nucleus.
 *
 * @author RandomCatGit
 */
public class RhoMeson extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				if (getElectricCharge() == 0) {
					particles.add(new UpQuark());
					particles.add(new UpAntiquark());
					particles.add(new DownQuark());
					particles.add(new DownAntiquark());
				} else {
					particles.add(new UpQuark());
					particles.add(new DownAntiquark());
				}
				return particles;
			}
		}.getParticles();
	}

}
