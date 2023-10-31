//---------- TASK 4 ----------

interface iNorm {
    double calculateNorm();
}

class iVector2D implements iNorm {
    private double x;
    private double y;

    public iVector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateNorm() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Vector2D: (" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        iVector2D vector2D = (iVector2D) obj;
        return Double.compare(vector2D.x, x) == 0 && Double.compare(vector2D.y, y) == 0;
    }
}


class iVector3D implements iNorm {
    private double x;
    private double y;
    private double z;

    public iVector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double calculateNorm() {
        return Math.max(Math.abs(x), Math.max(Math.abs(y), Math.abs(z)));
    }

    @Override
    public String toString() {
        return "Vector3D: (" + x + ", " + y + ", " + z + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        iVector3D vector3D = (iVector3D) obj;
        return Double.compare(vector3D.x, x) == 0 && Double.compare(vector3D.y, y) == 0 && Double.compare(vector3D.z, z) == 0;
    }
}