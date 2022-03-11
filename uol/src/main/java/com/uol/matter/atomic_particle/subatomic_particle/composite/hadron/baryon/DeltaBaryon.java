package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: DeltaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * DeltaBaryon is a family of subatomic particle made of three up or {@linkplain DownQuark}.
 *
 * @author RandomCatGit
 */
public final class DeltaBaryon extends SubatomicParticle {

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
		if (charge < -1 || charge > 2) {
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
		switch (charge) {
		case 2:
			setCompositeParticles(Arrays.asList(new UpQuark(), new UpQuark(), new UpQuark()));
			break;
		case 1:
			setCompositeParticles(Arrays.asList(new UpQuark(), new UpQuark(), new DownQuark()));
			break;
		case 0:
			setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new DownQuark()));
			break;
		case -1:
			setCompositeParticles(Arrays.asList(new DownQuark(), new DownQuark(), new DownQuark()));
			break;
		default:
			throw new IllegalArgumentException("DeltaBaryon can contain only -1, 0, 1 or 2 charge");
		}
	}

}
