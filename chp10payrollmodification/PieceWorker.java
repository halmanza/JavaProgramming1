
public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        if (pieces < 0) {
            throw new IllegalArgumentException("Pieces must be > 0");
        }
        this.wage = wage;
        this.pieces = pieces;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setPieces(int pieces) {
        if (pieces < 0) {
            throw new IllegalArgumentException("Pieces must be > 0");
        }
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return pieces * wage;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s %n%s: %s %n%s:$%s ", "Piece Worker", getFirstName(), getlastName(),
                "Total Pieces", getPieces(), "Wage", getWage());
    }

}