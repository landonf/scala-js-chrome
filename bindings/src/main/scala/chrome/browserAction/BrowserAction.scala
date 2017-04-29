package chrome.browserAction

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import chrome.events.bindings.Event
import chrome.tabs.bindings.Tab

@js.native
@JSGlobal("chrome.browserAction")
object BrowserAction extends js.Object {
  val onClicked: Event[js.Function1[Tab, _]] = js.native
}
