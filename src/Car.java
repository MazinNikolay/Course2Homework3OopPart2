public class Car extends Transport implements EngineInterface{
    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
    public void check() {
        this.updateTyre();
        this.checkEngine();
    }
}
