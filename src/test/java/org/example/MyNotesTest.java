package org.example;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class MyNotesTest {

  @Test
  public void newBoardCreatesEmptyBoard() throws Exception {
    Board board = new Board();

    assertThat(board.isEmpty())
        .isTrue();
  }

  @Test
  public void boardCreatesCardWhenRequested() throws Exception {
    Board board = new Board();
    Card card = board.createNewCard();

    assertThat(card)
        .isNotNull();
  }

  @Test
  //    Given an empty Board
  //    When I create a Card
  //    And add Details to the Card (some text)
  //    Then the Card is on the Board
  public void createCardIsAddedToBoard() throws Exception {
    Board board = new Board();
    Card card = board.createNewCard();
    card.addDetails("Write code");

    assertThat(board.cards())
        .contains(card);

    // board.contains(card) ??
  }
}
