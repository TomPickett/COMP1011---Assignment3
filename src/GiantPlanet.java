
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	//Private Instance Variables ------------------------------------------------------------
	private String _type; 
	
	//Public Properties ---------------------------------------------------------------------
	public String get_type() {
		return _type;
	}
	
	//Constructor ---------------------------------------------------------------------------
	public GiantPlanet(String name, double diameter, double mass, String type) {
		
		super(name, diameter, mass);
		this._type = type;
	}

	//Override Methods ----------------------------------------------------------------------
	@Override
	public Boolean hasRings() {
		return (get_ringCount() > 0) ? true : false;
	}

	@Override
	public Boolean hasMoons() {
		return (get_moonCount() > 0) ? true : false;
	}

}
