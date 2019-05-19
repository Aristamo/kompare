package sample

class Builder<T: Any?>(val value: T) {


    fun isEqualTo(comp: T): Builder<T> {
        if (value != comp) {
            throw AssertionError("Expected <2> to be Equal to <2>, but was <1>")
        }
        return this
    }
}
