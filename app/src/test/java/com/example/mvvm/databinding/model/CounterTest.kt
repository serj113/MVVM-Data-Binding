package com.example.mvvm.databinding.model
import org.junit.Assert.*
import org.junit.Test

class CounterTest {

    @Test
    fun `add counter woman should added 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addWoman()

        // Then
        assertEquals(1, counter.woman)
    }

    @Test
    fun `reduce counter woman should decreased 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addWoman()
        counter.reduceWoman()

        // Then
        assertEquals(0, counter.woman)
    }

    @Test
    fun `reduce counter woman should decreased 0 value when it's already 0`() {
        // Given
        val counter = Counter()

        // When
        counter.reduceWoman()

        // Then
        assertEquals(0, counter.woman)
    }

    @Test
    fun `add counter man should added 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addMan()

        // Then
        assertEquals(1, counter.man)
    }

    @Test
    fun `reduce counter man should decreased 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addMan()
        counter.reduceMan()

        // Then
        assertEquals(0, counter.man)
    }

    @Test
    fun `reduce counter man should decreased 0 value when it's already 0`() {
        // Given
        val counter = Counter()

        // When
        counter.reduceMan()

        // Then
        assertEquals(0, counter.man)
    }

    @Test
    fun `add counter kids should added 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addKid()

        // Then
        assertEquals(1, counter.kid)
    }

    @Test
    fun `reduce counter kids should decreased 1 value`() {
        // Given
        val counter = Counter()

        // When
        counter.addKid()
        counter.reduceKid()

        // Then
        assertEquals(0, counter.kid)
    }

    @Test
    fun `reduce counter kids should decreased 0 value when it's already 0`() {
        // Given
        val counter = Counter()

        // When
        counter.reduceKid()

        // Then
        assertEquals(0, counter.kid)
    }

}
