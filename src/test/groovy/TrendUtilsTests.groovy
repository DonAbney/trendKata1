package com.pillar.battle

import org.junit.Test

class TrendUtilsTests {

  @Test
  void shouldReturnNullWhenListIsEmpty() {
    def l = []

    assert null == TrendUtils.findTrend(l)
  }

  @Test
  void returnsNullWhenWhenListIsNull() {
    assert null == TrendUtils.findTrend(null);
  }

  @Test
  void returns0WhenWhenListHasOneValue() {
    assert 0 == TrendUtils.findTrend([1]);
  }

  @Test
  void givenTwoNumbersReturns1WhenFirstNumberIsZeroAndSecondIsNonZero() {
    assert 1.0 == TrendUtils.findTrend([0, 2]);
  }

  @Test
  void givenTwoNumberstheSameReturnZero() {
    assert 0 == TrendUtils.findTrend([2, 2]);
  }

  @Test
  void givenTwoDifferentNumbersWithFirstAsNonZeroReturnsAverage() {
    assert 3 == TrendUtils.findTrend([2, 4]);
  }
}
