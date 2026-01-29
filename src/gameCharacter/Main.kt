package gameCharacter


fun main() {
    val hero1 = GameCharacter("Рэмбо")
    handleCharacterState(hero1.state)

    hero1.changeState(CharacterState.Running)
    handleCharacterState(hero1.state)

    hero1.changeState(CharacterState.Attack(40))
    handleCharacterState(hero1.state)

    hero1.changeState(CharacterState.Death("Атака секретным оружием"))
    handleCharacterState(hero1.state)
}
fun handleCharacterState(state: CharacterState) {
    when(state) {
        is CharacterState.Inaction ->
            println("Персонаж в состоянии бездействия")

        is CharacterState.Running ->
            println("Персонаж бежит")

        is CharacterState.Attack ->
            println("Персонаж атакует с уроном ${state.damage}")

        is CharacterState.Death ->
            println("Персонаж погиб, причина: ${state.reason}")
    }
}