
public class Car {
	private String color;
	private double hpw;
	private double engine;
	private String make;

	public Car(){
		this.color = "";
		this.hpw = 0;
		this.engine = 0;
		this.make = "";
	}

	public Car (String make, double engine, double hpw, String color){
		this.color = color;
		this.hpw = hpw;
		this.engine = engine;
		this.make = make;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public double gethpw(){
		return hpw;
	}
	public void sethpw(double hpw){
		this.hpw = hpw;
	}
	public double getengine(){
		return engine;
	}
	public void setengine(double engine){
		this.engine = engine;
	}
	public String getmake(){
		return make;
	}
	public void setmake(String make){
		this.make = make;
	}
	public String toString(){
		return "Make: " + this.make + " , Color: " + this.color + " , Engine: " + this.engine + " , HorsePower: " + this.hpw ;
	}
}
