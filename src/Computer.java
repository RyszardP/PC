public class Computer {
    private String name;
    private String typeOS;
    private String manufacturer;
    private String model;
    private DVDrom dvd_rom;
    private HDD hdd;
    private RAM ram;

    public Computer(String name, String typeOS, String model) {
        this.name = name;
        this.typeOS = typeOS;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DVDrom getDvd_rom() {
        return dvd_rom;
    }

    public void setDvd_rom(DVDrom dvd_rom) {
        this.dvd_rom = dvd_rom;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void start() {
        System.out.println(" Начинаем работу начальник!!!");
    }

    public void shutdown() {
        System.out.println(" Покеда братан... ");
    }

    public void viruscheck() {
        System.out.println(" Система проверена, вирусов нет, продолжаем работу в штатном режиме");
    }
}
