public class Main {
    public static void main(String[] args) {
        //---------- TASK 1 ----------
        System.out.println("TASK 1");
        Engine[] engines = new Engine[3];

        engines[0] = new InternalCombustionEngine("Двигун 1", 100, "Бензин");
        engines[1] = new DieselEngine("Двигун 2", 80, "Дизель");
        engines[2] = new JetEngine("Двигун 3", 500, 1000);

        for (Engine engine : engines) {
            engine.show();
            System.out.println();
        }
        //---------- TASK 2 ----------
        System.out.println("\nTASK 2");
        Norm[] vectors = new Norm[2];

        vectors[0] = new Vector2D(3, 4);
        vectors[1] = new Vector3D(1, 2, 3);

        for (Norm vector : vectors) {
            System.out.println(vector);
            System.out.println("Norm: " + vector.calculateNorm());
            System.out.println();
        }

        System.out.println("Equals: " + vectors[0].equals(vectors[1]));
        //---------- TASK 3 ----------
        System.out.println("\nTASK 3");
        iNorm[] ivectors = new iNorm[2];

        ivectors[0] = new iVector2D(3, 4);
        ivectors[1] = new iVector3D(1, 2, 3);

        for (iNorm vector : ivectors) {
            System.out.println(vector);
            System.out.println("Norm: " + vector.calculateNorm());
            System.out.println();
        }

        System.out.println("Equals: " + ivectors[0].equals(ivectors[1]));
    }
}