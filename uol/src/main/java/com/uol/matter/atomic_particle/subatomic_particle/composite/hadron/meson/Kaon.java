package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: Kaon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Kaon is any of a group of four mesons distinguished by a quantum number called strangeness.
 *
 * @author RandomCatGit
 */
public class Kaon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Kaon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Kaon
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public Kaon(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("Kaons can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 0.49767f : 0.49369f);
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() throws IllegalArgumentException {
				List<SubatomicParticle> particles = new ArrayList<>();
				if (getElectricCharge() == 0) {
					particles.add(new DownQuark());
					particles.add(new StrangeAntiquark());
				} else {
					particles.add(new UpQuark());
					particles.add(new StrangeAntiquark());
				}
				return particles;
			}
		}.getParticles();
	}

}
