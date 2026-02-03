package outpostState

class OutpostManager {
    val resources = mutableListOf<ObservableResource>()
    init {
        println("OutpostManager инициализирован")
    }
    fun addResource(resource: ObservableResource) {
        resources.add(resource)
    }
}
