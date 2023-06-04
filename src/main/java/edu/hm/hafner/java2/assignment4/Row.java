package edu.hm.hafner.java2.assignment4;

/**
 * A base class for rows in the score board.
 *
 * @author Ullrich Hafner
 */
public abstract class Row {
    /** Represents a row entry that has not been set yet. */
    protected static final String EMPTY = " ";

    private final String displayName;

    protected Row(final String displayName) {
        this.displayName = displayName;
    }

    public final String getDisplayName() {
        return displayName;
    }

    /**
     * Returns the score for this row.
     *
     * @return the score for this row
     */
    public abstract int getScore();

    /**
     * Returns a textual representation of this row.
     *
     * @return the text of this row
     */
    public final String getText() {
        return EMPTY; // FIXME: implement row text as a combination of display name and score
    }

    /**
     * Returns the score for this row as a text. If the row has not been set already, then {@link #EMPTY} must be
     * returned.
     *
     * @return the score for this row
     */
    public String printScore() {
        return String.valueOf(getScore()); // FIXME: this default implementation is not applicable for all rows
    }

    @Override
    public String toString() {
        return getText();
    }
}
