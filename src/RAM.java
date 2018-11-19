public class RAM extends Device {
    private int frequency;
    private String latency;

    public RAM() {
    }

    public RAM(int frequency, String latency) {
        this.frequency = frequency;
        this.latency = latency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }
}
