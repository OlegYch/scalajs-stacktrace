package scalajs.stacktrace

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("stacktrace", JSImport.Default)
object StackTrace extends js.Object {
  def get(opts: js.Object): js.Array[StackFrame]     = js.native
  def getSync(opts: js.Object): js.Array[StackFrame] = js.native
  def fromError(error: js.Error, opts: js.Object): js.Array[StackFrame] =
    js.native
  def generateArtificially(opts: js.Object): Promise[js.Array[StackFrame]] =
    js.native
  def report(stackframes: js.Array[StackFrame],
             url: String,
             errorMsg: String): Unit = js.native
}
