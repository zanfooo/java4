public class Lavatrice extends ProgramableDevice{
    private String waterLevel;
    private int speedSpin;
    private int temperature;

    public Lavatrice(String waterLevel, int speedSpin, int temperature, int consumoEnergetico, String firmwareVersion, String modello) {
        super(consumoEnergetico, firmwareVersion, modello);
        this.waterLevel = waterLevel;
        this.speedSpin = speedSpin;
        this.temperature = temperature;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getSpeedSpin() {
        return speedSpin;
    }

    public void setSpeedSpin(int speedSpin) {
        this.speedSpin = speedSpin;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean isPoweredOn() {
        return false;
    }

    @Override
    public String toString() {
        return "Lavatrice{" +
                "waterLevel='" + waterLevel + '\'' +
                ", speedSpin=" + speedSpin +
                ", temperature=" + temperature +
                '}';
    }
}