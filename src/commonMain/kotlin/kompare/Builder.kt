package kompare

import kompare.message.BasicErrorMessage.fail

class Builder<T: Any?>(internal val value: T) {

    fun isEqualTo(comp: T): Builder<T> {
        if (value != comp) {
            fail("is equal to <$value>", value, comp)
        }
        return this
    }
}
