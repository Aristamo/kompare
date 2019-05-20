package sample

import sample.BaseAssertions.assertThat
import kotlin.test.Test

class BaseAssertionsTest {

    @Test
    fun `equality should occure if 1 and 1 are compared`() {
        assertThat(1).isEqualTo(1)
    }

    @Test
    fun `should fail with AssertionError if it is not equal`() {
        try {
            assertThat(2).isEqualTo(1)
        } catch (e: AssertionError) {
            // Test is succsessfull
            return
        } catch (e: Throwable) {
            throw AssertionError("Wrong Assertion is thrown, expected <${AssertionError::class.simpleName}> but was <${e::class.simpleName}>")
        }
        throw AssertionError("No Assertion was thrown")
    }

    @Test
    fun `should compare some other values than numbers`() {
        assertThat("This is a String").isEqualTo("This is a String")
        assertThat(true).isEqualTo(true)
        assertThat(0.01f).isEqualTo(0.01f)
    }
}