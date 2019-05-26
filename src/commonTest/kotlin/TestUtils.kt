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