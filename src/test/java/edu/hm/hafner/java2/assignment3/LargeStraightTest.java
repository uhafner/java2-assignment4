package edu.hm.hafner.java2.assignment3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests the class LargeStraight.
 *
 * @author Ullrich Hafner
 */
class LargeStraightTest {
    private YahtzeeEvaluator createYahtzeeEvaluator() {
        return null; // FIXME: create new instance
    }

    @Test
    void shouldFindLargeStraight() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(1, 2, 3, 4, 5)).isEqualTo(40);
        assertThat(counter.computeScore(2, 3, 4, 5, 6)).isEqualTo(40);

        assertThat(counter.computeScore(1, 3, 2, 5, 4)).isEqualTo(40);
        assertThat(counter.computeScore(6, 2, 3, 4, 5)).isEqualTo(40);

        assertThat(counter.computeScore(6, 2, 4, 3, 5)).isEqualTo(40);
    }

    @Test
    void shouldRejectAsLargeStraight() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator();

        assertThat(counter.computeScore(5, 5, 4, 4, 6)).isEqualTo(0);
        assertThat(counter.computeScore(1, 2, 4, 5, 6)).isEqualTo(0);
        assertThat(counter.computeScore(1, 2, 3, 4, 4)).isEqualTo(0);
        assertThat(counter.computeScore(2, 3, 4, 4, 5)).isEqualTo(0);
    }
}
