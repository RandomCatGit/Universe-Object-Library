package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: XiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * XiBaryon are also known as cascade particles due to their instability. They contain contain one {@linkplain UpQuark}
 * or {@linkplain DownQuark} plus two more massive quarks: either {@linkplain StrangeQuark}, {@linkplain CharmQuark} or
 * {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public final class XiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO XiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO XiBaryon
	 * 
	 * @param charge can take values 0 or -1
	 * @throws IllegalArgumentException
	 */
	public XiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != -1) {
			throw new IllegalArgumentException("XiBaryon can contain only 0 or -1 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 0:
			setMass(1.31506f);
			break;
		case -1:
			setMass(1.32178f);
			break;
		default:
			throw new IllegalArgumentException("XiBaryon can contain only 0 or -1 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpQuark() : new DownQuark(), new StrangeQuark(), new StrangeQuark()));
	}

}
