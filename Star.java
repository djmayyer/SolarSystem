import java.util.*;

public class Star extends Point {

    private String name;
    private double diameter;
    private String col;

    public ArrayList<Planet> planets = new ArrayList<Planet>();

    /**
     * @param name the name of the star.
     * @param diameter the size of the object.
	 * @param col the colour of this object, as a string. Case insentive.
	 */
    public Star(String name, double diameter, String col) {
        super(0, 0, 0, 0);

        this.name = name;
        this.diameter = diameter;
        this.col = col;
    }

    public String getName() {return this.name;}

    public double getDiameter() {return this.diameter;}

    public String getCol() {return this.col;}

    public void getName(String name) {this.name = name;}

    public void getDiameter(double diameter) {this.diameter = diameter;}

    public void getCol(String col) {this.col = col;}
    
    public void addPlanet(Planet planet)
    {
        planet.setCentreOfRotationAngle(this.angle);
        this.planets.add(planet);
    }

    public ArrayList<Planet> getPlanets(){return this.planets;}

    public void move()
    {
        if (this.planets.size() > 0) {
            for (Planet planet : this.planets) {
                planet.move();
            }
        }
    }
}