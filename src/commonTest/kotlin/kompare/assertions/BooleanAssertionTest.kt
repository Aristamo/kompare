package kompare.assertions

import kotlin.test.Test

class BooleanAssertionTest {

    @Test
    fun `isTrue() just runs`() {
        assertThat(true).isTrue()
    }

    @Test
    fun `isTrue() throws AssertionError if false is inserted`() {
        try {
            assertThat(false).isTrue()
        } catch (e: AssertionError) {
            return
        } catch (e: Throwable) {
            throw AssertionError("Wrong Exception is thrown, expected <${AssertionError::class.simpleName}> but was <${e::class.simpleName}>")
        }
        throw AssertionError("No Exception is thrown")
    }

    @Test
    fun `isFalse() just runs`() {
        assertThat(false).isFalse()
    }

    @Test
    fun `isFalse() throws AssertionError if true is inserted`() {
        try {
            assertThat(true).isFalse()
        } catch (e: AssertionError) {
            return
        } catch (e: Throwable) {
            throw AssertionError("Wrong Exception is thrown, expected <${AssertionError::class.simpleName}> but was <${e::class.simpleName}>")
        }
        throw AssertionError("No Exception is thrown")
    }

}
