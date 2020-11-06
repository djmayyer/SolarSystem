/**
 * This class stores point coordinates
 */
public class Point {

    protected double distance;
    protected double angle;
    protected double centreOfRotationDistance;
    protected double centreOfRotationAngle;

    /**
	 * @param distance the distance from this object to the point about which it is orbiting.
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
	 * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
	 */
    public Point(double distance, double angle, double centreOfRotationDistance, double centreOfRotationAngle)
    {
        this.distance = distance;
        this.angle = angle;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
    }

    /**
	 * returns the distance from this object to the point about which it is orbiting.
	 */

    public double getDistance() {return this.distance;}

    /**
	 * returns the angle (in degrees) that represents how far the object is around its orbit.
	 */

    public double getAngle() {return this.angle; }

    /**
	 * returns the distance part of the polar co-ordinate about which this object orbits.
	 */

    public double getCentreOfRotationDistance() {return this.centreOfRotationDistance;}

    /**
	 * returns the angular part of the polar co-ordinate about which this object orbits.
	 */

    public double getCentreOfRotationAngle() {return this.centreOfRotationAngle;}


    /**
	 * @param distance the distance from this object to the point about which it is orbiting.
	 */

    public void setDistance(double distance) {this.distance = distance;}

    /**
	 * @param angle the angle (in degrees) that represents how far the object is around its orbit.
	 */

    public void setAngle(double angle) {this.angle = angle;}

    /**
	 * @param centreOfRotationDistance the distance part of the polar co-ordinate about which this object orbits.
	 */

    public void setCentreOfRotationDistance(double centreOfRotationDistance) {this.centreOfRotationDistance = centreOfRotationDistance;}

    /**
	 * @param centreOfRotationAngle the angular part of the polar co-ordinate about which this object orbits.
	 */

    public void setCentreOfRotationAngle(double centreOfRotationAngle) {this.centreOfRotationAngle =centreOfRotationAngle;}
}