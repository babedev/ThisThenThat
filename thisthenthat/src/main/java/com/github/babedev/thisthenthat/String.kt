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
    if (this.all { it.isNotEmpty() }) {
        next(this)
        return true
    }

    return false
}

infix fun <T : CharSequence> T.and(x: T): Iterable<CharSequence> {
    return arrayListOf(this, x)
}

infix fun <T : CharSequence> Iterable<T>.and(x: T): Iterable<CharSequence> {
    (this as MutableCollection).add(x)
    return this
}