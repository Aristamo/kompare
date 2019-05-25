package kompare.assertions

import kompare.Builder

fun <T : Boolean?> Builder<T>.isTrue(): Builder<T> {
    if (this.value != true) {
        throw AssertionError()
    }
    return this
}

fun <T: Boolean?> Builder<T>.isFalse(): Builder<T> {
    if (this.value != false) {
        throw AssertionError()
    }
    return this
}