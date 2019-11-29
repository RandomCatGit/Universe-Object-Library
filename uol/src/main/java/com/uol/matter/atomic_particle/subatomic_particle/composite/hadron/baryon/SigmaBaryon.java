package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: SigmaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * SigmaBaryon are a family of subatomic hadron particles which have two quarks from the first flavour generation
 * ({@linkplain UpQuark} and/or {@linkplain DownQuark}), and a third quark from higher flavour generations, in a
 * combination where the wavefunction does not swap sign when any two quark flavors are swapped.
 *
 * @author RandomCatGit
 */
public class SigmaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO SigmaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO SigmaBaryon
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @param spin   can take values 1/2 or 3/2
	 * @throws IllegalArgumentException
	 */
	public SigmaBaryon(int charge, int spin) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("SigmaBaryon can contain only -1, 0, or 1 charge");
		}
		if (spin != 1 / 2 || spin != 3 / 2) {
			throw new IllegalArgumentException("SigmaBaryon can contain only 1/2 or 3/2 spin");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 1:
			setMass(spin == 1 / 2 ? 1.18944f : 1.3832f);
			break;
		case 0:
			setMass(spin == 1 / 2 ? 1.192666f : 1.3847f);
			break;
		case -1:
			setMass(spin == 1 / 2 ? 1.197479f : 1.3877f);
			break;
		default:
			throw new IllegalArgumentException("SigmaBaryon can contain only -1, 0, or 1 charge");
		}
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 1:
					particles.add(new UpQuark());
					particles.add(new UpQuark());
					particles.add(new StrangeQuark());
					break;
				case 0:
					particles.add(new UpQuark());
					particles.add(new DownQuark());
					particles.add(new StrangeQuark());
					break;
				case -1:
					particles.add(new DownQuark());
					particles.add(new DownQuark());
					particles.add(new StrangeQuark());
					break;
				default:
					throw new IllegalArgumentException("SigmaBaryon can contain only -1, 0, or 1 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
