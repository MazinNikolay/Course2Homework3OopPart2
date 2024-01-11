public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck1", 8),
                new Bicykle("bicycle1", 2),
                new Bicykle("bicycle2", 2)
        };
        ServiceStation station = new ServiceStation();
        for (Transport transportIterator : transports) {
            station.check(transportIterator);
        }
    }
}