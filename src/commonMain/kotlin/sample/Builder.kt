package sample

class Builder<T: Any?>(val value: T) {


    fun isEqualTo(comp: T): Builder<T> {
        return this
    }
}
