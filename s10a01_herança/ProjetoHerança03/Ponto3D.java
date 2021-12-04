public class Ponto3D extends Ponto2D {
    private double z;

    public Ponto3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override // sobrepondo o método toString da classe Object
    public String toString() {
        return String.format("(%.2f,%.2f,%.2f)", getX(), getY(), z);
    }
}
