abstract public class ProgramableDevice implements Machine{
    private int consumoEnergetico;
    private String firmwareVersion;
    private String modello;

    public ProgramableDevice(int consumoEnergetico, String firmwareVersion, String modello) {
        this.consumoEnergetico = consumoEnergetico;
        this.firmwareVersion = firmwareVersion;
        this.modello = modello;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "ProgramableDevice{" +
                "consumoEnergetico=" + consumoEnergetico +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
