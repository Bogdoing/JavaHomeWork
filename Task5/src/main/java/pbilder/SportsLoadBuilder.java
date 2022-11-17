package pbilder;

public class SportsLoadBuilder implements LoadBuilder {

	private String chassis;
	private String body;
	private String paint;
	private String interior;

	public SportsLoadBuilder() {
		super();
	}

	@Override
	public LoadBuilder fixChassis() {
		System.out.println("Assembling chassis of the sports model");
		this.chassis = "Sporty Chassis";
		return this;
	}

	@Override
	public LoadBuilder fixBody() {
		System.out.println("Assembling body of the sports model");
		this.body = "Sporty Body";
		return this;
	}

	@Override
	public LoadBuilder paint() {
		System.out.println("Painting body of the sports model");
		this.paint = "Sporty Torch Red Paint";
		return this;
	}

	@Override
	public LoadBuilder fixInterior() {
		System.out.println("Setting up interior of the sports model");
		this.interior = "Sporty interior";
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
