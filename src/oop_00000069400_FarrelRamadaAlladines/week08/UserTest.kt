package oop_00000069400_FarrelRamadaAlladines.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }

    fun runMockUnitTest() {
        println("\n=== RUNNING UNIT TEST ===")
        val testUser = findUser(1)

        // Di Unit Testing, penggunaan !! sangat lazim karena jika null, test HARUS gagal
        val initial = testUser!!.name.substring(0, 1)

        // check() adalah fungsi bawaan Kotlin untuk assertion
        check(initial == "T") { "Test Failed! Initial is wrong." }
        println("Test Passed: Initial is T")
    }
}