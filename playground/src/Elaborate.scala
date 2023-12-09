import circt.stage._

object Elaborate extends App {
  def top   = new GCD()
  def hello = new Hello()
  def and = new And()
  val generator = Seq(
    chisel3.stage.ChiselGeneratorAnnotation(() => top),
    chisel3.stage.ChiselGeneratorAnnotation(() => hello),
    chisel3.stage.ChiselGeneratorAnnotation(() => and)
  )
  (new ChiselStage).execute(args, generator :+ CIRCTTargetAnnotation(CIRCTTarget.Verilog))
}
