import kotlin.random.Random

fun main() {

    val listaNumero=mutableListOf<Int>()

for(i in 0..10){

    listaNumero.add(Random.nextInt(0,100))

}

println("Ordenados de menor a mayor: ")

    listaNumero.sort()
    listaNumero.forEach {
        println(it)
    }

println("\nOrdenados de mayor a menor: ")

    listaNumero.sortDescending()
    listaNumero.forEach {
        println(it)
    }

    println("\nOrdenados en una lista nueva de menor a mayor")

    val listaNuevaNumerosAscendentes=listaNumero.sorted()

    listaNuevaNumerosAscendentes.forEach {
        println(it)
    }

    println("\nOrdenados en una lista nueva de mayor a menor")

    val listaNuevaNumerosDescendentes=listaNumero.sortedDescending()

    listaNuevaNumerosDescendentes.forEach {
        println(it)
    }



    val listaAlumnos= mutableListOf<AlumnosComparables>()

    for(i in 0..10){

        listaAlumnos.add(AlumnosComparables("Alumno $i", Random.nextInt(0,10)))
    }

    println("\nLista de alumnos ordenados por la nota: ")

    listaAlumnos.sort()
    listaAlumnos.forEach {
        println(it.toString())
    }



    println("\nLista de alumnos ordenados alfabeticamente: ")

    listaAlumnos.sortBy {
        it.nombre
    }

    listaAlumnos.forEach {
        println(it.toString())
    }

    println("\nLista de alumnos ordenados por longitud de nombre: ")

    listaAlumnos.sortBy {
        it.nombre.length
    }

    listaAlumnos.forEach {
        println(it.toString())
    }


}

class AlumnosComparables(var nombre:String, var nota:Int): Comparable<AlumnosComparables>{

    override fun compareTo(other: AlumnosComparables): Int {
        return nota - other.nota
    }

    override fun toString(): String {
        return "Soy el $nombre y he sacado un $nota"
    }
}