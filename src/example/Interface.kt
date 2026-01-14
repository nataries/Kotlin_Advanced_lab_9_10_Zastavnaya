package example

interface Movable{
    var speed: Int
    val model: String
    val number: String
   fun move()
    fun stop() {
        println("Останавливаемся")
    }
}

interface VideoPlayable {
    fun play() = println("Play video")
}
interface AudioPlayable {
    fun play() = println("Play audio")
}

class MediaPlayer: VideoPlayable, AudioPlayable {
    override fun play() {
        println("Start playing")
        super<AudioPlayable>.play()
        super<AudioPlayable>.play()
    }
}

class Car(override val model: String,
          override val number: String) : Movable{
    override var speed: Int = 60
        set(value) {}

    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft(override val model: String,
               override val number: String) : Movable{
    override fun move(){
        println("Летим на самолёте")
    }

    override var speed: Int = 600
    override fun stop() {
        println("Приземляемся")
    }
}
fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}

interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun work() = println("$name работает")
    override fun study() = println("$name учится")
}
fun main() {
//    val car = example.Car()
//    val aircraft = example.Aircraft()
//      car.move()
//    aircraft.move()
//    example.travel(car)
//    example.travel(aircraft)
//    val anton = example.WorkingStudent("Anton")
//    anton.work()
//    anton.study()
//    val car = example.Car("LADA", "134LAD")
//    var aircraft = example.Aircraft("Boeing", "737")
    val player = MediaPlayer()
    player.play()
}