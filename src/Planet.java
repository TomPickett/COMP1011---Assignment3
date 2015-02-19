
public abstract class Planet {
	
	//Private Instance Variables -----------------------------------------------------------
	private double _diameter;
	private double _mass;
	private double _orbitalPeriod;
	private double _rotationPeriod;
	private String _name;
	private int _ringCount;
	private int _moonCount;
	
	//Public Properties --------------------------------------------------------------------
	
	public double get_diameter() {
		return _diameter;
	}

	public double get_mass() {
		return _mass;
	}

	public String get_name() {
		return _name;
	}
	
	public int get_moonCount() {
		return _moonCount;
	}
	public void set_moonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	public double get_orbitalPeriod() {
		return _orbitalPeriod;
	}
	public void set_orbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	
	public int get_ringCount() {
		return _ringCount;
	}
	public void set_ringCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	
	public double get_rotationPeriod() {
		return _rotationPeriod;
	}
	public void set_rotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	//Contructor Method--------------------------------------------------------------------
	public Planet() {
		//Creating name, diameter and mass as local variables and assigning them to the related intance variables
		String name = this._name;
		double diameter = this._diameter;
		double mass = this._mass;
	}
	
	//Override the public method toString()--------------------------------------------------
	@Override
	public String toString() {
		
		return "The Planets Name is: " + this._name + " with a diameter of: " + this._diameter + " and a mass of: " + this._mass;
		
	}	
}
