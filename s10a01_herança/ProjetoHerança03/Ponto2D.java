public final class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override // sobrepondo o método toString da classe Object
    public String toString() {
        return String.format("(%.2f,%.2f)", x, y);
    }
}