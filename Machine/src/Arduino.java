public class Arduino extends ProgramableDevice{
    private double voltage;
    private String connectedPin;

    public Arduino(double voltage, String connectedPin, int consumoEnergetico, String firmwareVersion, String modello) {
        super(consumoEnergetico, firmwareVersion, modello);
        this.voltage = voltage;
        this.connectedPin = connectedPin;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getConnectedPin() {
        return connectedPin;
    }

    public void setConnectedPin(String connectedPin) {
        this.connectedPin = connectedPin;
    }

    @Override
    public boolean isPoweredOn() {
        return false;
    }

    @Override
    public String toString() {
        return "Arduino{" +
                "voltage=" + voltage +
                ", connectedPin='" + connectedPin + '\'' +
                '}';
    }
}
