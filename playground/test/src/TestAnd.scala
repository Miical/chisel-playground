import chisel3._
import chiseltest._

import utest._

object TestAnd extends ChiselUtestTester{
    val tests = Tests {
        test("And"){
            testCircuit(new And){
                dut =>
                    dut.io.a.poke(1.U)
                    dut.io.b.poke(1.U)
                    dut.io.out.expect(1.U)
                    dut.io.a.poke(2.U)
                    dut.io.b.poke(2.U)
                    dut.io.out.expect(2.U)
                    dut.io.a.poke(3.U)
                    dut.io.b.poke(3.U)
                    dut.io.out.expect(3.U)
                    dut.io.a.poke(0.U)
                    dut.io.b.poke(0.U)
                    dut.io.out.expect(0.U)
            }

        }
    }


}
