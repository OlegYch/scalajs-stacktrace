package scalajs.stacktrace

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("stackframe", JSImport.Default)
class StackFrame extends js.Object {
  def getArgs: js.Array[String]               = js.native
  def setArgs(args: js.Array[String]): Unit   = js.native
  def getEvalOrigin(): String                 = js.native
  def setEvalOrigin(evalOrigin: String): Unit = js.native
  override def toString: String               = js.native
}