//Thomas Pickett
//@version 1.0 - Finished and started testing


public class Main {

	public static void main(String[] args) {
		
		// Creating the Giant Planet Object
		GiantPlanet jupiter = new GiantPlanet("Jupiter", 139822.0, 1.898, "Gas");
		//showing its data to the user
		System.out.println(jupiter.toString());
		
		// Creating the Terrestrial Planet Object
		TerrestrialPlanet earth = new TerrestrialPlanet("Earth", 12756.0, 317.8, true);
		//Showing its data to the user
		System.out.println(earth.toString());	
	}
}

