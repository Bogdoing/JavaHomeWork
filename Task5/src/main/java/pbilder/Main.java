package pbilder;

public class Main {

	public static void main(String[] args) {
		LoadBuilder builder = new SportsLoadBuilder();
		AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
		Load load = engineer.manufactureCar();
		if (load != null) {
			System.out.println("Below car delievered: ");
			System.out.println("======================================================================");
			System.out.println(load);
			System.out.println("======================================================================");
		}
	}

}
