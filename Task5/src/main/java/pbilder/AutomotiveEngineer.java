package pbilder;

public class AutomotiveEngineer {

	private LoadBuilder builder;

	public AutomotiveEngineer(LoadBuilder builder) {
		super();
		this.builder = builder;
		if (this.builder == null) {
			throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
		}
	}

	public Load manufactureCar() {
		return builder.fixChassis().fixBody().paint().fixInterior().build();
	}

}
