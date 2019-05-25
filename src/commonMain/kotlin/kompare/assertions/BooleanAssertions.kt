package kompare.assertions

import kompare.Builder

fun <T : Boolean?> Builder<T>.isTrue(): Builder<T> {
    if (this.value != true) {
        throw AssertionError()
    }
    return this
}