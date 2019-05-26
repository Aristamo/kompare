package kompare.message

object BasicErrorMessage {

    fun fail(message: String, expected: Any?, actual: Any?): Nothing {
        throw AssertionError("Expected that <$expected> $message : found <$actual>")
    }
}