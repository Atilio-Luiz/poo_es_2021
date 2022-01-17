public class Manager extends Employee {
    private Employee secretary;

    public Manager(String name, int id, short y, byte m, byte d) {
        super(name, id, y, m, d);
    }

    public Employee getSecretary() {
        return this.secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        String result = super.toString() + 
                        "\nSecretary: " + secretary;
        return result;
    }
}
