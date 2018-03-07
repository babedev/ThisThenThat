package com.github.babedev.thisthenthat

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test

class StringTest {

    @Test
    fun checkIsNotEmpty_callNext() {
        val next: (CharSequence) -> Unit = mock()

        "hello".isNotEmpty(next)

        verify(next).invoke("hello")
    }
}