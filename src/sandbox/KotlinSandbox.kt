package sandbox;

fun main(args : Array<String>) {
    println("Hello World!");

    println(add(1, 2));
    println(add(num1 = 1, num2 = 2));
    println(add(2));
    println(add(num1 = 2));
}

fun add (num1 : Int, num2 : Int = 3, num3 : Int = 2): Int = num1 + num2 + num3