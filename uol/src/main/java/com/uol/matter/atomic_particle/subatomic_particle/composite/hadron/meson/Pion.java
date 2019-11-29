package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: Pion
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Pion or pi meson is the lightest meson and, more generally, the lightest hadron. Each pion consists of a quark and an
 * antiquark.
 *
 * @author RandomCatGit
 */
public class Pion extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Pion
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Pion
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public Pion(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("Pions can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 0.1349772f : 0.13957053f);
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
