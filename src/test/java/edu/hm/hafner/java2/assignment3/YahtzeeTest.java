package edu.hm.hafner.java2.assignment3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests the class Yahtzee.
 *
 * @author Ullrich Hafner
 */
class YahtzeeTest {
    private YahtzeeEvaluator createYahtzeeEvaluator() {
        return null; // FIXME: create new instance
    }

    @Test
    void testsScoreForYahtzee() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(1, 1, 1, 1, 1)).isEqualTo(50);
        assertThat(counter.computeScore(5, 5, 5, 5, 5)).isEqualTo(50);
    }

    @Test
    void testsScoreForNoYahtzee() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(5, 5, 5, 5, 4)).isEqualTo(0);
        assertThat(counter.computeScore(1, 2, 3, 4, 5)).isEqualTo(0);
    }
}
