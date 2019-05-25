package kompare.assertions

import kotlin.test.Test

class BooleanAssertionTest {

    @Test
    fun `isTrue() is implemented`() {
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



}
