
package PassThrough

import chisel3._
import chisel3.util._
import chisel3.iotesters.{ChiselFlatSpec, Driver, PeekPokeTester}

object PTmain extends App{
  Driver.execute(args, () => new PTgenerator(4)){
    c => new WaveformTester_PT(c)
  }
}