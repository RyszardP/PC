public class DVDrom extends Device {
    private String dimension;
    private double speedOfReading;

    public DVDrom() {
    }


    public DVDrom(String dimension, double speedOfReading, String type) {
        this.type = type;
        this.dimension = dimension;
        this.speedOfReading = speedOfReading;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public double getSpeedOfReading() {
        return speedOfReading;
    }

    public void setSpeedOfReading(double speedOfReading) {
        this.speedOfReading = speedOfReading;
    }
}
