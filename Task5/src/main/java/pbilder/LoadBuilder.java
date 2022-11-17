package pbilder;

public interface LoadBuilder {

	// Step 1
	public LoadBuilder fixChassis();

	// Step 2
	public LoadBuilder fixBody();

	// Step 3
	public LoadBuilder paint();

	// Step 4
	public LoadBuilder fixInterior();

	// delivery of car
	public Load build();
}
