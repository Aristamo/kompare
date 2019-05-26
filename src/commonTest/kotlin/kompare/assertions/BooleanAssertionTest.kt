package kompare.assertions

import catchAssertionError
import kotlin.test.Test

class BooleanAssertionTest {

    @Test
    fun `isTrue() just runs`() {
        assertThat(true).isTrue()
    }

    @Test
    fun `isTrue() throws AssertionError if false is inserted`() {
        catchAssertionError {
            assertThat(false).isTrue()
        }
    }

    @Test
    fun `isFalse() just runs`() {
        assertThat(false).isFalse()
    }

    @Test
    fun `isFalse() throws AssertionError if true is inserted`() {
        catchAssertionError {
            assertThat(true).isFalse()
        }
    }




}
