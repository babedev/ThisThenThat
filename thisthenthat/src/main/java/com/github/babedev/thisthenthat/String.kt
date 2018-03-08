package com.github.babedev.thisthenthat

inline fun <T : CharSequence> T.isEmpty(next: () -> Unit): Boolean {
    if (this.isEmpty()) {
        next()
        return true
    }

    return false
}

inline fun <T : CharSequence> T.isNotEmpty(next: (T) -> Unit): Boolean {
    if (this.isNotEmpty()) {
        next(this)
        return true
    }

    return false
}

inline fun <T : CharSequence, U : Iterable<T>> U.isNotEmpty(next: (U) -> Unit): Boolean {
    if (this.any { it.isNotEmpty() }) {
        next(this)
        return true
    }

    return false
}

infix fun <T : CharSequence> T.and(x: CharSequence): Iterable<CharSequence> {
    return arrayListOf(this, x)
}