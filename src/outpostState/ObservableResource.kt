package outpostState

import kotlin.properties.Delegates

class ObservableResource(val name: String, amountInit: Int, var observer: ResourceObserver? = null) {
    var amount: Int by Delegates.observable(amountInit) {_, old, new ->
        println("Ресурс $name изменён: $old -> $new")
        observer?.changedResource(name, old, new)
    }
}