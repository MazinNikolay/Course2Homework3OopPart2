public abstract class WheelledTransport implements Checkable {
    private String modelName;
    private int wheelsCount;

    public WheelledTransport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void check() {
        this.updateTyre();
    }
}
