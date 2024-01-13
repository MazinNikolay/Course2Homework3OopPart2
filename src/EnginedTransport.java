public abstract class EnginedTransport extends WheelledTransport {
    public EnginedTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }
}
