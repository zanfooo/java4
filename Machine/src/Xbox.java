public class Xbox extends ProgramableDevice{
    private String networkStatus;
    private int numControllerConnected;
    private double storageCapacity;

    public Xbox(String networkStatus, int numControllerConnected, double storageCapacity, int consumoEnergetico, String firmwareVersion, String modello) {
        super(consumoEnergetico, firmwareVersion, modello);
        this.networkStatus = networkStatus;
        this.numControllerConnected = numControllerConnected;
        this.storageCapacity = storageCapacity;
    }

    public String getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
    }

    public int getNumControllerConnected() {
        return numControllerConnected;
    }

    public void setNumControllerConnected(int numControllerConnected) {
        this.numControllerConnected = numControllerConnected;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public boolean isPoweredOn() {
        return false;
    }

    @Override
    public String toString() {
        return "Xbox{" +
                "networkStatus='" + networkStatus + '\'' +
                ", numControllerConnected=" + numControllerConnected +
                ", storageCapacity=" + storageCapacity +
                '}';
    }
}
