//---------- TASK 1 ----------
class Engine {
    private String type;
    private double power;

    public Engine(String type, double power) {
        this.type = type;
        this.power = power;
    }

    public void show() {
        System.out.println("Тип двигуна: " + type);
        System.out.println("Потужність: " + power + " кВт");
    }
}

class InternalCombustionEngine extends Engine {
    private String fuelType;

    public InternalCombustionEngine(String type, double power, String fuelType) {
        super(type, power);
        this.fuelType = fuelType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Тип пального: " + fuelType);
    }
}

class JetEngine extends Engine {
    private double thrust;

    public JetEngine(String type, double power, double thrust) {
        super(type, power);
        this.thrust = thrust;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Тяга: " + thrust + " Н");
    }
}

class DieselEngine extends InternalCombustionEngine {
    public DieselEngine(String type, double power, String fuelType) {
        super(type, power, fuelType);
    }
}