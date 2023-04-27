package edu.hm.hafner.java2.assignment3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests the class Chance.
 *
 * @author Ullrich Hafner
 */
class ChanceTest {
    private YahtzeeEvaluator createYahtzeeEvaluator() {
        return null; // FIXME: create new instance
    }

    @Test
    void shouldSumFacesForMinimum() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(1, 1, 1, 1, 1)).isEqualTo(5);
    }

    @Test
    void shouldSumFacesForMaximum() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(6, 6, 6, 6, 6)).isEqualTo(30);
    }

    @Test
    void shouldSumFacesForMiddle() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(1, 2, 3, 4, 5)).isEqualTo(15);
    }
}
