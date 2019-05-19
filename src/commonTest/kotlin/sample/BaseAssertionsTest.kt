package sample

import sample.BaseAssertions.assertThat
import kotlin.test.Test

class BaseAssertionsTest {

    @Test
    fun `equality should run trough`() {
        assertThat(1).isEqualTo(1)
    }
}