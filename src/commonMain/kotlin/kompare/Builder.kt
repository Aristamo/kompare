package kompare

class Builder<T: Any?>(internal val value: T) {

    fun isEqualTo(comp: T): Builder<T> {
        if (value != comp) {
            throw AssertionError()
        }
        return this
    }
}
