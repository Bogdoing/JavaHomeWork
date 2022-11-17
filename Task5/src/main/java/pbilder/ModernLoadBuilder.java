package pbilder;

public class ModernLoadBuilder implements LoadBuilder {

	private String chassis;
	private String body;
	private String paint;
	private String interior;

	public ModernLoadBuilder() {
		super();
	}

	@Override
	public LoadBuilder fixChassis() {
		System.out.println("Assembling chassis of the modern model");
		this.chassis = "Modern Chassis";
		return this;
	}

	@Override
	public LoadBuilder fixBody() {
		System.out.println("Assembling body of the modern model");
		this.body = "Modern Body";
		return this;
	}

	@Override
	public LoadBuilder paint() {
		System.out.println("Painting body of the modern model");
		this.paint = "Modern Black Paint";
		return this;
	}

	@Override
	public LoadBuilder fixInterior() {
		System.out.println("Setting up interior of the modern model");
		this.interior = "Modern interior";
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
