package edu.hm.hafner.java2.assignment4;

/**
 * A bonus for the upper board. If the six entries sum up to 63 or more, then a bonus of 35 is achieved.
 *
 * @author Ullrich Hafner
 */
public class Bonus extends Row {
    /**
     * Creates a new bonus.
     *
     * @param entries
     *         the six entries of the upper half of the board
     */
    public Bonus(final Row... entries) {
        super("Bonus");
    }

    @Override
    public int getScore() {
        return 0; // FIXME: implement bonus calculation
    }
}
