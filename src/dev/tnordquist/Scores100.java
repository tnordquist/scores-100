package dev.tnordquist;

/**
 * CodingBat: Given an array of scores, return true if there are scores of 100 next to each other in
 * the array. The array length will be at least 2.
 */

public class Scores100 {

  public boolean scores100(int[] scores) {

    final int CENT = 100;

    for (int i = 0; i < scores.length - 1; ++i) {

      if (scores[i] == CENT && scores[i + 1] == CENT) {
        return true;
      }

    }
    return false;
  }
}
