package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: DoubleBottomXiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * DoubleBottomXiBaryon is a {@linkplain XiBaryon} with two {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public final class DoubleBottomXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DoubleBottomXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DoubleBottomXiBaryon
	 * 
	 * @param charge can take values 0 or -1
	 * @throws IllegalArgumentException
	 */
	public DoubleBottomXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != -1) {
			throw new IllegalArgumentException("DoubleBottomXiBaryon can contain only 0 or -1 charge");
		}
		setSpin(1 / 2);
		setMass(Float.NaN); // Mass unknown
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpQuark() : new DownQuark(), new BottomQuark(), new BottomQuark()));
	}

}
