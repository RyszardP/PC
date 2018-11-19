public class MyPC {
    public static void main (String[]args){
        RAM ram = new RAM();
        DVDrom dvDrom = new DVDrom();
        HDD hdd = new HDD(7200,1,"HDD");
        Computer myPC = new Computer("Sprinter","Windows","SP");

        myPC.setHdd(hdd);
        myPC.start();
        myPC.viruscheck();
        myPC.shutdown();
    }
}
