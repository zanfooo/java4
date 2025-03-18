public class Server extends ProgramableDevice{
    private String ipAddress;
    private double ramUsage;
    private double cpuUsage;

    public Server(String ipAddress, double ramUsage, double cpuUsage, int consumoEnergetico, String firmwareVersion, String modello) {
        super(consumoEnergetico, firmwareVersion, modello);
        this.ipAddress = ipAddress;
        this.ramUsage = ramUsage;
        this.cpuUsage = cpuUsage;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public double getRamUsage() {
        return ramUsage;
    }

    public void setRamUsage(double ramUsage) {
        this.ramUsage = ramUsage;
    }

    public double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    @Override
    public boolean isPoweredOn() {
        return false;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ipAddress='" + ipAddress + '\'' +
                ", ramUsage=" + ramUsage +
                ", cpuUsage=" + cpuUsage +
                '}';
    }
}
