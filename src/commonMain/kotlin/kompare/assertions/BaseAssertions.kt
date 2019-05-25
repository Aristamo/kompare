package kompare.assertions

import kompare.Builder

/**
 * This object is the Base for the Assertions.
 */


fun <T : Any?> assertThat(i: T) = Builder(i)