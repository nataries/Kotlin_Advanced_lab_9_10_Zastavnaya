package outpostState

class ResourceObserver {
    fun changedResource(resourceName: String, old: Int, new: Int) {
        println("Количество ресурса $resourceName изменено: $old -> $new")
    }
}