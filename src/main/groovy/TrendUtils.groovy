package com.pillar.battle

class TrendUtils {

  def static findTrend(input) {
    if (input) {
      if (input[0]==0&&input[1]>0) {
          return 1
      } else if (null==input[1]){
          return 0
      } else if (input[0]!=input[1]){
        return input[1]-input[0]/input[0]
    }

      return 0
    }

    return null
  }

}
