import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        SolarSystem ss = new SolarSystem(800, 800);

        // Stars (name, diameter, colour)
        Star s_sun = new Star("The Sun", 80, "YELLOW");

        // Planets (name, diameter, colour, distance, start angle)
        Planet p_mercury = new Planet("Mercury", 10, "DARK_GRAY", 60, 0);
        Planet p_venus = new Planet("Venus", 20, "RED", 120, 30);
        Planet p_earth = new Planet("Earth", 20, "BLUE", 200, 60);
        Planet p_mars = new Planet("Mars", 18, "ORANGE", 260, 60);
        Planet p_saturn= new Planet("Saturn", 50, "DARK_GRAY", 300, 100);
        Planet p_uranus = new Planet("Uranus", 20, "#80bfff", 360, 180);

        // Earth Satellites (name, diameter, colour, distance, start angle)
        Satellite s_moon = new Satellite("The Moon", 5, "LIGHT_GRAY", 20, 20);

        // Add Earth satellites
        p_earth.addSatellite(s_moon);

        // Add Jupiter satellites
        for (int i = 0; i < 80; i++) {

            int r_a = (int) (Math.random() * (360 - 0)) + 0; // randomize angle (int) (Math.random() * (upper - lower)) + lower;
            int r_d = 40 + (int) (Math.random() *  (50 - 0)) + 0; // randomize distance

            Satellite j_sat = new Satellite("Saturn Satellite " + i, 2, "LIGHT_GRAY", r_d, r_a);
            p_saturn.addSatellite(j_sat);
        }

        // Add planets to the sun
        s_sun.addPlanet(p_mercury);
        s_sun.addPlanet(p_venus);
        s_sun.addPlanet(p_earth);
        s_sun.addPlanet(p_mars);
        s_sun.addPlanet(p_saturn);
        s_sun.addPlanet(p_uranus);

        // main loop
        while (true) {

            // draw the Sun
            ss.drawSolarObject(0, 0, s_sun.getDiameter(), s_sun.getCol());

            // draw the planets orbiting the sun
            ArrayList<Planet> s_sun_planets = s_sun.getPlanets();
            if (s_sun_planets.size() > 0) {

                for (Planet planet : s_sun_planets) {

                    ss.drawSolarObjectAbout(
                        planet.getDistance(), 
                        planet.getAngle(), 
                        planet.getDiameter(), 
                        planet.getCol(), 
                        planet.getCentreOfRotationDistance(), 
                        planet.getCentreOfRotationAngle()
                    );

                    // draw the satellittes orbiting the planet
                    ArrayList<Satellite> planet_sattellites = planet.getSatellites();
                    if (planet_sattellites.size() > 0) {

                        for (Satellite satellite : planet_sattellites) {
                            ss.drawSolarObjectAbout(
                                satellite.getDistance(), 
                                satellite.getAngle(), 
                                satellite.getDiameter(), 
                                satellite.getCol(), 
                                satellite.getCentreOfRotationDistance(), 
                                satellite.getCentreOfRotationAngle()
                            );
                        }
                    }
                }
            }
         
            // move all objects
            // movement of planets is handled by star object
            // movement of satellites is handled by planet object
            s_sun.move();

            Thread.sleep(20);
            ss.finishedDrawing();
        }
    }
}