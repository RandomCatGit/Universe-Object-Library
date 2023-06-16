package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * DoubleCharmedXiBaryon is a {@linkplain XiBaryon} with two {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class DoubleCharmedXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO DoubleCharmedXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO DoubleCharmedXiBaryon
	 * 
	 * @param charge can take values 1 or 2
	 * @throws IllegalArgumentException
	 */
	public DoubleCharmedXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 1 && charge != 2) {
			throw new IllegalArgumentException("DoubleCharmedXiBaryon can contain only 1 or 2 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 1:
			setMass(3.5198f);
			break;
		case 2:
			setMass(3.62253f);
			break;
		default:
			throw new IllegalArgumentException("DoubleCharmedXiBaryon can contain only 1 or 2 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 1 ? new DownQuark() : new UpQuark(), new CharmQuark(), new CharmQuark()));
	}

}
