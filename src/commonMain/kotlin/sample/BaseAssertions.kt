package sample

/**
 * This object is the Base for the Assertions.
 */
object BaseAssertions {

    fun <T: Any?> assertThat(i: T): Builder<T> {
        return Builder(i)
    }

}