package pbilder;

public class ClassicLoadBuilder implements LoadBuilder {

	private String chassis;
	private String body;
	private String paint;
	private String interior;

	public ClassicLoadBuilder() {
		super();
	}

	@Override
	public LoadBuilder fixChassis() {
		System.out.println("Assembling chassis of the classical model");
		this.chassis = "Classic Chassis";
		return this;
	}

	@Override
	public LoadBuilder fixBody() {
		System.out.println("Assembling body of the classical model");
		this.body = "Classic Body";
		return this;
	}

	@Override
	public LoadBuilder paint() {
		System.out.println("Painting body of the classical model");
		this.paint = "Classic White Paint";
		return this;
	}

	@Override
	public LoadBuilder fixInterior() {
		System.out.println("Setting up interior of the classical model");
		this.interior = "Classic interior";
		return this;
	}

	@Override
	public Load build() {
		Load load = new Load(chassis, body, paint, interior);
		if (load.doQualityCheck()) {
			return load;
		} else {
			System.out.println("Car assembly is incomplete. Can't deliver!");
		}
		return null;
	}

}
