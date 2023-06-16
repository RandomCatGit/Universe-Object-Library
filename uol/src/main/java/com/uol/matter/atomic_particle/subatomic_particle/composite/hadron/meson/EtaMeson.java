package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * EtaMeson is an isosinglet meson made of a mixture of {@linkplain UpQuark}, {@linkplain DownQuark} and
 * {@linkplain StrangeQuark} and their antiquarks, {@linkplain UpAntiquark}, {@linkplain DownAntiquark} and
 * {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public final class EtaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO EtaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO EtaMeson
	 */
	public EtaMeson() {
		setSpin(0);
		setMass(0.54788f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new UpQuark(), new UpAntiquark(), new DownQuark(), new DownAntiquark(), new StrangeQuark(), new StrangeAntiquark(), new StrangeQuark(), new StrangeAntiquark()));
	}

}
