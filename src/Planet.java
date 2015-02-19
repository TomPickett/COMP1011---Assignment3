
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
		return this._diameter;
	}

	public double get_mass() {
		return this._mass;
	}

	public String get_name() {
		return this._name;
	}
	
	public int get_moonCount() {
		return this._moonCount;
	}
	public void set_moonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	
	public double get_orbitalPeriod() {
		return this._orbitalPeriod;
	}
	public void set_orbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	
	public int get_ringCount() {
		return this._ringCount;
	}
	public void set_ringCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	
	public double get_rotationPeriod() {
		return this._rotationPeriod;
	}
	public void set_rotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

	//Contructor Method--------------------------------------------------------------------
	public Planet(String name, double diameter, double mass) {
		//Creating name, diameter and mass as local variables and assigning them to the related intance variables
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	}
	
	//Override the public method toString()--------------------------------------------------
	@Override
	public String toString() {
		
		return "The Planet's Name is " + this._name + ", with a diameter of " + this._diameter + "km, and a mass of " + this._mass + "kg";
		
	}	
}
