public abstract class TrailerTransport extends EnginedTransport {
    public TrailerTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        super.check();
        this.checkTrailer();
    }
}
