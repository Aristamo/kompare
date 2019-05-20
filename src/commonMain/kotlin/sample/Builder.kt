package sample

class Builder<T: Any?>(private val value: T) {

    fun isEqualTo(comp: T): Builder<T> {
        if (value != comp) {
            throw AssertionError()
        }
        return this
    }
}
