package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: DoubleCharmedXiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * DoubleCharmedXiBaryon is a {@linkplain XiBaryon} with two {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public class DoubleCharmedXiBaryon extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 1:
					particles.add(new DownQuark());
					particles.add(new CharmQuark());
					particles.add(new CharmQuark());
					break;
				case 2:
					particles.add(new UpQuark());
					particles.add(new CharmQuark());
					particles.add(new CharmQuark());
					break;
				default:
					throw new IllegalArgumentException("DoubleCharmedXiBaryon can contain only 1 or 2 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
