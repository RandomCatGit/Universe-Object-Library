package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: CharmedSigmaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedSigmaBaryon is a {@linkplain SigmaBaryon} with a {@linkplain CharmQuark} instead of a
 * {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedSigmaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedSigmaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmedSigmaBaryon
	 * 
	 * @param charge can take values 0, 1 or 2
	 * @param spin   can take values 1/2 or 3/2
	 * @throws IllegalArgumentException
	 */
	public CharmedSigmaBaryon(int charge, int spin) throws IllegalArgumentException {
		if (charge != 0 && charge != 1 && charge != 2) {
			throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
		}
		if (spin != 1 / 2 && spin != 3 / 2) {
			throw new IllegalArgumentException("SigmaBaryon can contain only 1/2 or 3/2 spin");
		}
		setSpin(spin);
		switch (charge) {
		case 0:
			setMass(spin == 1 / 2 ? 2.4542f : 2.5185f);
			break;
		case 1:
			setMass(spin == 1 / 2 ? 1.192666f : 2.5198f);
			break;
		case 2:
			setMass(spin == 1 / 2 ? 2.4542f : 2.519f);
			break;
		default:
			throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
		}
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 0:
					particles.add(new UpQuark());
					particles.add(new UpQuark());
					particles.add(new CharmQuark());
					break;
				case 1:
					particles.add(new UpQuark());
					particles.add(new DownQuark());
					particles.add(new CharmQuark());
					break;
				case 2:
					particles.add(new DownQuark());
					particles.add(new DownQuark());
					particles.add(new CharmQuark());
					break;
				default:
					throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
