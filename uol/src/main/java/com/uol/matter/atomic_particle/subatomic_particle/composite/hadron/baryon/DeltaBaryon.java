package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: DeltaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * DeltaBaryon is a family of subatomic particle made of three up or {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public class DeltaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DeltaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DeltaBaryon
	 * 
	 * @param charge can take values -1, 0, 1 or 2
	 * @throws IllegalArgumentException
	 */
	public DeltaBaryon(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1 && charge != 2) {
			throw new IllegalArgumentException("DeltaBaryon can contain only -1, 0, 1 or 2 charge");
		}
		switch (charge) {
		case 2:
			setSpin(3 / 2);
			break;
		case 1:
			setSpin(1 / 2);
			break;
		case 0:
			setSpin(-1 / 2);
			break;
		case -1:
			setSpin(-3 / 2);
			break;
		default:
			throw new IllegalArgumentException("DeltaBaryon can contain only -1, 0, 1 or 2 charge");
		}
		setMass(1.234f);
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 2:
					particles.add(new UpQuark());
					particles.add(new UpQuark());
					particles.add(new UpQuark());
					break;
				case 1:
					particles.add(new UpQuark());
					particles.add(new UpQuark());
					particles.add(new DownQuark());
					break;
				case 0:
					particles.add(new UpQuark());
					particles.add(new DownQuark());
					particles.add(new DownQuark());
					break;
				case -1:
					particles.add(new DownQuark());
					particles.add(new DownQuark());
					particles.add(new DownQuark());
					break;
				default:
					throw new IllegalArgumentException("DeltaBaryon can contain only -1, 0, 1 or 2 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
