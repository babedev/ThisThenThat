package com.github.babedev.thisthenthat

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert.assertEquals
import org.junit.Test

class StringTest {

    @Test
    fun checkItemIsEmpty_callNext() {
        val next: () -> Unit = mock()

        val result = "".isEmpty(next)

        verify(next).invoke()
        assertEquals(true, result)
    }

    @Test
    fun checkItemIsNotEmpty_callNext() {
        val next: (CharSequence) -> Unit = mock()

        val result = "hello".isNotEmpty(next)

        verify(next).invoke("hello")
        assertEquals(true, result)
    }

    @Test
    fun checkItemsAreNotEmpty_callNext() {
        val items = "hello" and "world" and "!!!"
        val next: (Iterable<CharSequence>) -> Unit = mock()

        val result = items.isNotEmpty(next)

        verify(next).invoke(items)
        assertEquals(true, result)
    }
}