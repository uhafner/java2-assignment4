package edu.hm.hafner.java2.assignment4;

import org.junit.jupiter.api.Test;

import edu.hm.hafner.java2.assignment4.ScoreBoard.Category;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests the class {@link ScoreBoard}.
 *
 * @author Ullrich Hafner
 */
class ScoreBoardTest {
    @Test
    void shouldPrintEmptyBoard() {
        ScoreBoard scoreBoard = createScoreBoard();

        assertThat(scoreBoard.print()).isEqualToIgnoringNewLines("""
                0 Punkte nach 0 Runden
                              Einser   -
                              Zweier   -
                              Dreier   -
                              Vierer   -
                              Fünfer   -
                             Sechser   -
                          Summe oben   0
                               Bonus   0
                Gesamter oberer Teil   0
                            Drilling   -
                            Vierling   -
                          Full House   -
                       Kleine Straße   -
                        Große Straße   -
                             Yahtzee   -
                              Chance   -
                         Summe unten   0
                         Gesamtsumme   0
                """);
        assertThat(scoreBoard.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreYahtzee() {
        ScoreBoard scoreBoard = createScoreBoard();

        assertThat(scoreBoard.evaluateScore(Category.YAHTZEE, 1, 1, 1, 1, 1)).isEqualTo(50);

        scoreBoard.playRound(Category.YAHTZEE, 1, 1, 1, 1, 1);
        assertThat(scoreBoard.print()).isEqualToIgnoringNewLines("""
                50 Punkte nach 1 Runden
                              Einser   -
                              Zweier   -
                              Dreier   -
                              Vierer   -
                              Fünfer   -
                             Sechser   -
                          Summe oben   0
                               Bonus   0
                Gesamter oberer Teil   0
                            Drilling   -
                            Vierling   -
                          Full House   -
                       Kleine Straße   -
                        Große Straße   -
                             Yahtzee  50
                              Chance   -
                         Summe unten  50
                         Gesamtsumme  50
                """);
    }

    private ScoreBoard createScoreBoard() {
        return new ScoreBoard();
    }
}