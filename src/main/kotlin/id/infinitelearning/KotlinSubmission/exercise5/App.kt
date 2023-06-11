package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile("Akmal Sakirin", 20, 170)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/
    val groups = mapOf(
        "Group 1" to listOf("jalan" to 5, "lari" to 2, "makan" to 3, "minum" to 1, "lompat" to 3, "duduk" to 1),
        "Group 2" to listOf("jalan" to 2, "lari" to 2, "makan" to 1, "minum" to 3, "lompat" to 1, "duduk" to 2),
        "Group 3" to listOf("jalan" to 3, "lari" to 1, "makan" to 5, "minum" to 1, "lompat" to 5, "duduk" to 3),
        "Group 4" to listOf("jalan" to 5, "lari" to 4, "makan" to 4, "minum" to 4, "lompat" to 3, "duduk" to 2),
        "Group 5" to listOf("jalan" to 4, "lari" to 1, "makan" to 3, "minum" to 5, "lompat" to 5, "duduk" to 3),
        "Group 6" to listOf("jalan" to 2, "lari" to 4, "makan" to 2, "minum" to 2, "lompat" to 7, "duduk" to 4)
    )

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    for ((group, activities) in groups) {
        println("========== $group ==========")
        for ((activity, times) in activities) {
            repeat(times) {
                when (activity) {
                    "jalan" -> hero.jalan()
                    "lari" -> hero.lari()
                    "makan" -> hero.makan()
                    "minum" -> hero.minum()
                    "lompat" -> hero.lompat()
                    "duduk" -> hero.duduk()
                }
            }
        }
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()


}