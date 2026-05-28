package oop_00000069400_FarrelRamadaAlladines.week13

import java.io.File
import java.io.FileNotFoundException

// Definisikan kerangka data Student
data class Student(val name: String, val age: Int, val gpa: Double)

// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name,$age,$gpa"

// Deserialization (CSV -> Object)
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(
        name = parts[0].trim(),
        age = parts[1].trim().toInt(),
        gpa = parts[2].trim().toDouble()
    )
}

// Fungsi untuk mengatur aliran File I/O kolektif (Save)
fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString(separator = "\n") { it.toCsv() })
}

// Fungsi untuk mengatur aliran File I/O kolektif dengan menangani FileNotFoundException (Load)
fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(line = it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}