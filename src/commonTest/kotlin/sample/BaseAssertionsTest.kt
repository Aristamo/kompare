package sample

import sample.BaseAssertions.assertThat
import kotlin.test.Test

class BaseAssertionsTest {

    @Test
    fun `equality should run trough`() {
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
}