package chrome.browser.bindings

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("chrome.browser")
object Browser extends js.Object {

  def openTab(options: OpenTabOptions,
              callback: js.UndefOr[js.Function0[_]] = js.undefined): Unit =
    js.native

}
