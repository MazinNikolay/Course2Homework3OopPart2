public class ServiceStation {
    public void check(WheelledTransport wheelledTransport) {
        if (wheelledTransport != null) {
            System.out.println("Обслуживаем " + wheelledTransport.getModelName());
            wheelledTransport.check();
        }
    }
}
