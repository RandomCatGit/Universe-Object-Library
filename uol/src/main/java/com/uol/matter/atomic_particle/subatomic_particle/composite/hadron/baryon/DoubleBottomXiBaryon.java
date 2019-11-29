package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

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
 */

/**
 * DoubleBottomXiBaryon is a {@linkplain XiBaryon} with two {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class DoubleBottomXiBaryon extends SubatomicParticle {

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
		// setMass(); // Mass unknown
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 0:
					particles.add(new UpQuark());
					particles.add(new BottomQuark());
					particles.add(new BottomQuark());
					break;
				case -1:
					particles.add(new DownQuark());
					particles.add(new BottomQuark());
					particles.add(new BottomQuark());
					break;
				default:
					throw new IllegalArgumentException("DoubleBottomXiBaryon can contain only 0 or -1 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
