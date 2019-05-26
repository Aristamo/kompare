import kompare.assertions.assertThat

fun catchAssertionError(f: () -> Unit) {
    try {
        f()
    } catch (e: AssertionError) {
        return
    } catch (e: Throwable) {
        throw AssertionError("Wrong Exception is thrown, expected <${AssertionError::class.simpleName}> but was <${e::class.simpleName}>")
    }
    throw AssertionError("No Exception is thrown")
}

fun compareErrorMessage(expectedMessage: String, f: () -> Unit) {
    try {
        f()
    } catch (e: Throwable) {
        assertThat(e.message).isEqualTo(expectedMessage)
        return
    }
    throw AssertionError("No error is thrown.")
}