package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: BMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * BMeson is meson composed of a {@linkplain BottomAntiquark} and either an {@linkplain UpQuark} or
 * {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public class BMeson extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() throws IllegalArgumentException {
				List<SubatomicParticle> particles = new ArrayList<>();
				if (getElectricCharge() == 0) {
					particles.add(new DownQuark());
					particles.add(new BottomAntiquark());
				} else {
					particles.add(new UpQuark());
					particles.add(new BottomAntiquark());
				}
				return particles;
			}
		}.getParticles();
	}

}
