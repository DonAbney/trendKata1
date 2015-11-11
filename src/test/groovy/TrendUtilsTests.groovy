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
}
