package edu.hm.hafner.java2.assignment4;

/**
 * An entry in the score board that holds an instance of {@link YahtzeeEvaluator}.
 *
 * @author Ullrich Hafner
 */
public class Entry extends Row {
    /**
     * Creates a new entry for the score board.
     *
     * @param displayName
     *         the display name
     * @param evaluator
     *         the score evaluator
     */
    public Entry(final String displayName, final YahtzeeEvaluator evaluator) {
        super(displayName);
    }

    @Override
    public int getScore() {
        return 0; // FIXME: implement entry score calculation
    }

    public boolean isChosen() {
        return false; // FIXME: implement chosen state
    }

    /**
     * Choose this entry and create the score from the specified faces. Afterward, this entry is marked as chosen and
     * cannot be chosen again.
     *
     * @param faces
     *         the faces to use
     *
     * @throws IllegalArgumentException
     *         if the entry has been chosen before
     */
    public void choose(final int... faces) {
        // FIXME: implement entry choosing
    }

    /**
     * Returns the possible score for this entry for the given faces.
     *
     * @param faces
     *         the faces of the roll
     *
     * @return the possible score
     */
    public int evaluateScore(final int... faces) {
        return 0; // FIXME: implement entry choosing
    }
}
