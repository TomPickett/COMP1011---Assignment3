
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	//Private Intsance variables ------------------------------------------------------------
	private boolean _oxygen;
	
	//Public Properties ---------------------------------------------------------------------
	public boolean get_oxygen() {
		return _oxygen;
	}
	
	//Constructor --------------------------------------------------------------------------
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen) {
		//Calling the instace variables from the super class Planet
		super(name, diameter, mass);
		//initializing the local vairiable for this class
		this._oxygen = oxygen;
	}

	//Override Methods ----------------------------------------------------------------------
	@Override
	public Boolean habitable() {
			return(this._oxygen) ? true : false;
		}

	@Override
	public Boolean hasMoons() {
		return (get_moonCount() > 0) ? true : false;
	}

}
