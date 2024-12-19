package org.grapheco.lynx.procedure

import org.grapheco.lynx.func.LynxProcedure
import org.grapheco.lynx.types.property.LynxNumber

/**
 * @ClassName LogarithmicFunctions
 * @Description These functions all operate on numerical expressions only,
 * and will return an error if used on any other values.
 * @Author huchuan
 * @Date 2022/4/20
 * @Version 0.1
 */
class LogarithmicFunctions {
  @LynxProcedure(name = "e")
  def e(): Double = {
    Math.E
  }

  @LynxProcedure(name = "exp")
  def exp(x: LynxNumber): Double = {
    math.exp(x.number.doubleValue())
  }

  @LynxProcedure(name = "log")
  def log(x: LynxNumber): Double = {
    math.log(x.number.doubleValue())
  }

  @LynxProcedure(name = "log10")
  def log10(x: LynxNumber): Double = {
    math.log10(x.number.doubleValue())
  }

  @LynxProcedure(name = "sqrt")
  def sqrt(x: LynxNumber): Double = {
    math.sqrt(x.number.doubleValue())
  }  
   @LynxProcedure(name = "abs")
  def abs(x: LynxNumber): Double = {
    math.abs(x.number.doubleValue())
}
  @LynxProcedure(name = "cbrt")
  def cbrt(x: LynxNumber): Double = {
    math.cbrt(x.number.doubleValue())
}

@LynxProcedure(name = "floor")
  def floor(x: LynxNumber): Double = {
    math.floor(x.number.doubleValue())
}

@LynxProcedure(name = "ceil")
  def ceil(x: LynxNumber): Double = {
    math.ceil(x.number.doubleValue())
}

}
