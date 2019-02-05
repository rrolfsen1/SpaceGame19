package cs2

import java.io.PrintWriter

object HelloWorld {
	def main(args:Array[String]):Unit = {
		println("Hello, world!")
	}
	val pw = new PrintWriter("TESTFILE")
	pw.print("Hello!")
	pw.close
	
}

