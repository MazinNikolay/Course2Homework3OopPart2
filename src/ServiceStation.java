public class ServiceStation {
    public void check(Transport arg1, Transport arg2, Transport arg3) {
        Transport[] transports = {arg1, arg2, arg3};
        for (Transport transport : transports) {
            if (transport != null) {
                System.out.println("Обслуживаем " + transport.getModelName());
                transport.updateTyre();
                transport.checkEngine();
                transport.checkTrailer();
            }
        }
    }
}
