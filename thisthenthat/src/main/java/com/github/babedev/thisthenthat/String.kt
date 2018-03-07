package com.github.babedev.thisthenthat

inline fun <T : CharSequence> T.isEmpty(next: (T) -> Unit): Boolean {
    if (this.isEmpty()) {
        next(this)
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