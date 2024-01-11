public class Truck extends Transport {
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
