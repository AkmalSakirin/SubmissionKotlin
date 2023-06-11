package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    //contoh Kasus Mengubah kata menjadi bilangan biner.

    val word = "AkmalSakirin" // Kata yang akan diubah menjadi bilangan biner

    try {
        val binary = convertToBinary(word) // Mengonversi kata menjadi bilangan biner
        println("Hasil konversi: $binary")
    } catch (e: IllegalArgumentException) {
        println("Terjadi kesalahan: Input tidak valid")
    }
}

fun convertToBinary(word: String): String {
    val binaryStringBuilder = StringBuilder()

    for (char in word) {
        val binary = char.toInt().toString(2) // Mengonversi karakter menjadi bilangan biner
        binaryStringBuilder.append(binary).append(" ")
    }

    return binaryStringBuilder.toString().trim()
}