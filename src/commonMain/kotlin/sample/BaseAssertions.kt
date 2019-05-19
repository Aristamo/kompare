package sample

object BaseAssertions {

    fun <T: Any?> assertThat(i: T): Builder<T> {
        return Builder(i)
    }

}