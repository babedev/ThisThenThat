package com.github.babedev.thisthenthat

inline fun <T : CharSequence> T.isEmpty(next: (T) -> Unit) {
    if (this.isEmpty()) {
        next(this)
    }
}

inline fun <T : CharSequence> T.isNotEmpty(next: (T) -> Unit) {
    if (this.isNotEmpty()) {
        next(this)
    }
}