fun main(){
  val humans = Human("Belyse",21,60)

    humans.eat(1)
    println(humans.weight)
    humans.speak("the food was good")
    humans.birthday()
    println(humans.age)
val names = User("Nyampundu","belyse","belysean@gmail.com",3239291,"mujawaberaa")
    println(names.firstName)
    println(names.lastName)


}
class Human(val name: String, var age: Int, var weight: Int){
    fun eat(foodWeight: Int){
      println("I am eating $foodWeight kgs of food.")
        weight += foodWeight
    }
    fun speak(speech: String){
        println("she said that $speech")
    }
    fun birthday() {
        age++
    }
}
  data class User(val firstName: String,val lastName: String,val email: String,val phoneNumber: Int,val passWord: String)



