package outpostState
val manager by lazy {
    OutpostManager()
}
fun main() {
    val observer = ResourceObserver()
    val loadedResources = StateStorage.load()

    if (loadedResources.isEmpty()) {
        val min = ObservableResource("Minerals", 240, observer)
        val en = ObservableResource("Energy", 170, observer )

        manager.addResource(min)
        manager.addResource(en)
        min.amount = 200
        en.amount = 190
    }

    StateStorage.save(manager.resources)
    manager.resources.forEach { println("${it.name}: ${it.amount}") }
}