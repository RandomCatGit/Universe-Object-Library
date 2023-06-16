package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * BottomXiBaryon is a {@linkplain XiBaryon} with a {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public final class BottomXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BottomXiBaryon
	 * 
	 * @param charge can take values 0 or -1
	 * @throws IllegalArgumentException
	 */
	public BottomXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != -1) {
			throw new IllegalArgumentException("BottomXiBaryon can contain only 0 or -1 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 0:
			setMass(5.795f);
			break;
		case -1:
			setMass(5.7959f); // There are 3 more mass in Cascade B BottomXiBaryon. Don't know difference.
			break;
		default:
			throw new IllegalArgumentException("BottomXiBaryon can contain only 0 or -1 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpQuark() : new DownQuark(), new StrangeQuark(), new StrangeQuark()));
	}

}
