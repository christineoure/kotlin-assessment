import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement

fun main(){
   name()
    var num = mod(10,3)
    println(num)
    var x = identity("Hi, my name is Oure","and I am 21 years old")
    println(x)
    idea()
}
//creating a function that takes a string of 5th, 6th, 7th and 8th characters
fun name(){
    var school = "CodeHive"
    println(school[4].toString()+school[5]+school[6]+school[7])
}
//creating a function that returns the remainder of a division
fun mod(a:Int,b:Int):Int{
    var modulus = a%b
    return modulus

}
//creating a function that takes in your name and age
fun identity (name:String,age:String):String{
    var name = "Hi, my name is Oure"
    var age = "and I am 21 years old"
    var stmt = "$name ,$age"
    return stmt

}
//creating a function that takes in s string and returns its length
fun idea(){
    var fact = "I am AkiraChix"
    println(fact.length)
}