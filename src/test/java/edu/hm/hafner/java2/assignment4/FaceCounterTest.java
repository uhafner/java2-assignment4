package edu.hm.hafner.java2.assignment4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests the class FaceCounter.
 *
 * @author Ullrich Hafner
 */
class FaceCounterTest {
    private YahtzeeEvaluator createYahtzeeEvaluator(final int i) {
        return null; // FIXME: create new instance
    }

    @Test
    void shouldCountOnlyOnes() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator(1);

        assertThat(counter.computeScore(5, 4, 3, 2, 1)).isEqualTo(1);
        assertThat(counter.computeScore(1, 4, 3, 2, 1)).isEqualTo(2);
        assertThat(counter.computeScore(1, 4, 1, 2, 1)).isEqualTo(3);
        assertThat(counter.computeScore(1, 1, 1, 1, 1)).isEqualTo(5);
        assertThat(counter.computeScore(2, 3, 4, 5, 3)).isEqualTo(0);
    }

    @Test
    void shouldCountOnlyFives() {
        YahtzeeEvaluator counter = createYahtzeeEvaluator(5);

        assertThat(counter.computeScore(5, 4, 3, 2, 1)).isEqualTo(5);
        assertThat(counter.computeScore(5, 5, 5, 5, 5)).isEqualTo(25);
        assertThat(counter.computeScore(2, 3, 4, 1, 3)).isEqualTo(0);
    }

    @Test
    void shouldFailIfFaceIsInvalid() {
        assertThatIllegalArgumentException()
                .as("Illegal face")
                .isThrownBy(
                        () -> createYahtzeeEvaluator(0)).withMessageContaining("0");
        assertThatIllegalArgumentException()
                .as("Illegal face")
                .isThrownBy(
                        () -> createYahtzeeEvaluator(7)).withMessageContaining("7");

    }
}
