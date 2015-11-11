package com.pillar.battle

class TrendUtils {

  def static findTrend(input) {
    if (input) {
      if (input[0]==0&&input[1]>0) {
          return 1
      }
      return 0
    }

    return null
  }

}
