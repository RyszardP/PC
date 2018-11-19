public class HDD extends Device {
    private double spindleSpeed;
    private String dimension;
    private double volume;

    public HDD(double spindleSpeed,  double volume, String type) {
        this.spindleSpeed = spindleSpeed;
        this.volume = volume;
        this.type = type;
    }

    public double getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(double spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void printSpindleSpeed() {
        System.out.println("Скорость шпинделя " + this.spindleSpeed);
    }

    public void printVolume() {
        System.out.println(" Объем " + this.volume);
    }

    public void printDimension (){
        System.out.println(" Размер " + this.dimension);
    }
}

