public class Bicykle extends Transport {
    public Bicykle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void check() {
        this.updateTyre();
    }
}
