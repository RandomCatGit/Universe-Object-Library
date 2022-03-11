package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: CharmedXiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * CharmedXiBaryon is a {@linkplain XiBaryon} with {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmedXiBaryon
	 * 
	 * @param charge can take values 0 or 1
	 * @throws IllegalArgumentException
	 */
	public CharmedXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != 1) {
			throw new IllegalArgumentException("CharmedXiBaryon can contain only 0 or 1 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 0:
			setMass(2.4714f);
			break;
		case 1:
			setMass(2.4683f);
			break;
		default:
			throw new IllegalArgumentException("CharmedXiBaryon can contain only 0 or 1 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new DownQuark() : new UpQuark(), new StrangeQuark(), new CharmQuark()));
	}

}
