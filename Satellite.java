public class Satellite extends Point {

    private String name;
    private double diameter;
    private String col;

	/**
     * @param name the name of the planet
	 * @param diameter the size of the object.
     * @param col the colour of this object, as a string. Case insentive.
	 * @param distance the distance from this object to the point about which it is orbiting.
     * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 */
    public Satellite(String name, double diameter, String col, double distance, double angle)
    {
        super(distance, angle, 0, 0);

        this.name = name;
        this.diameter = diameter;
        this.col = col;
    }

    public String getName() {return this.name;}

    public double getDiameter(){return this.diameter;}

    public String getCol(){return this.col;}

    public void getName(String name){this.name = name;}

    public void getDiameter(double diameter) {this.diameter = diameter;}

    public void getCol(String col){this.col = col;}

    public void move() {this.angle = (this.angle == 360) ? 0 : this.angle + 4;}
}