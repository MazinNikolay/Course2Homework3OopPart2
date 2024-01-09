public class Truck extends Transport implements WheelsInterface, EngineInterface {
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void check() {
        this.updateTyre();
        this.checkEngine();
        System.out.println("Проверяем прицеп");
    }
}
