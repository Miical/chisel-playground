import chisel3._

class And extends Module {
  val io = IO(new Bundle {
    val a   = Input(UInt(2.W))
    val b   = Input(UInt(2.W))
    val out = Output(UInt(2.W))
  })
  io.out := io.a & io.b
  printf("Print during simulation: Input a is %d\n", io.a)
  // chisel printf has its own string interpolator too
  printf(p"Print during simulation: IO is $io\n")

  println(s"Print during generation: Input a is ${io.a}")
}
