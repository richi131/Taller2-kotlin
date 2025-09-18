//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
// Lambda para calcular el factorial
    val factorial: (Int) -> Int = { n ->
        var resultado = 1
        for(i in 1..n){
            resultado *=i
        }
        resultado
    }
    //ingresar un numero
    println("ingresa un numero:")
    val numero=readLine()!!.toInt()
    //muestra el resultado
    println("El factorial de $numero es:${factorial(numero)}")
}
