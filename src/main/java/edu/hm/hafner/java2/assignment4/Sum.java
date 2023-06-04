package edu.hm.hafner.java2.assignment4;

/**
 * A sum in the score board that sums up all enclosed rows.
 *
 * @author Ullrich Hafner
 */
public class Sum extends Row {

    /**
     * Creates a new sum with the specified name that dynamically computes the sum of its containing rows.
     *
     * @param displayName
     *         name of the category
     * @param entries
     *         the entries that will be summed up
     */
    public Sum(final String displayName, final Row... entries) {
        super(displayName);
    }

    @Override
    public int getScore() {
        return 0; // FIXME: implement summing of entries
    }
}
