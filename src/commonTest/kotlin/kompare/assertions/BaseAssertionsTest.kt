package kompare.assertions

import catchAssertionError
import kotlin.test.Test

class BaseAssertionsTest {

    @Test
    fun `assertThat() should run`() {
        assertThat(1)
    }

    @Test
    fun `equalTo() should run`() {
        assertThat(1).isEqualTo(1)
    }

    @Test
    fun `isEqualTo() should fail if two different numbers are inserted`() {
        catchAssertionError {
            assertThat(2).isEqualTo(1)
        }
    }

    @Test
    fun `isEqualTo() should run with other types`() {
        assertThat("This is a String").isEqualTo("This is a String")
        assertThat(true).isEqualTo(true)
        assertThat(0.01f).isEqualTo(0.01f)
    }

    @Test
    fun `isEqualTo() should fail with other types`() {
        catchAssertionError {
            assertThat("String").isEqualTo("STR")
        }
        catchAssertionError {
            assertThat(true).isEqualTo(false)
        }
        catchAssertionError {
            assertThat(0.01f).isEqualTo(0.1f)
        }
    }
}