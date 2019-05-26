package kompare.assertions

import kompare.Builder
import kompare.message.BasicErrorMessage.fail

fun <T : Boolean?> Builder<T>.isTrue(): Builder<T> {
    if (this.value != true) {
        fail("to be true", true, this.value)
    }
    return this
}

fun <T: Boolean?> Builder<T>.isFalse(): Builder<T> {
    if (this.value != false) {
        fail("to be false", false, this.value)
    }
    return this
}