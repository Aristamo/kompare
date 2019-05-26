package message

import compareErrorMessage
import kompare.assertions.assertThat
import kompare.assertions.isFalse
import kompare.assertions.isTrue
import kotlin.test.Test

class BasicErrorMessageTest {

    @Test
    fun `isEqualTo() should fail with a message`() {
        try {
            assertThat(true).isEqualTo(false)
        } catch (e: Throwable) {
            assertThat(e.message.isNullOrBlank()).isFalse()
        }
    }

    @Test
    fun `isEqualTo() should fail with an expected message`() {
        val expected = "Expected that <1> is equal to <1> : found <2>"
        compareErrorMessage(expected) {
            assertThat(1).isEqualTo(2)
        }
    }

    @Test
    fun `isTrue() should fail with an expected message`() {
        val expected = "Expected that <true> to be true : found <false>"
        compareErrorMessage(expected) {
            assertThat(false).isTrue()
        }
    }

    @Test
    fun `isFalse() should fail with an expected message`() {
        val expected = "Expected that <false> to be false : found <true>"
        compareErrorMessage(expected) {
            assertThat(true).isFalse()
        }
    }
}