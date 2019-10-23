package com.example.mvvm.databinding.ui.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun `add counter woman should added 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterWoman()

        // Then
        assertEquals(1, mainVM.getCounterWoman().value)
    }

    @Test
    fun `reduce counter woman should decreased 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterWoman()
        mainVM.reduceCounterWoman()

        // Then
        assertEquals(0, mainVM.getCounterWoman().value)
    }

    @Test
    fun `reduce counter woman should decreased 0 value when it's already 0`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.reduceCounterWoman()

        // Then
        assertEquals(0, mainVM.getCounterWoman().value)
    }

    @Test
    fun `add counter man should added 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterMan()

        // Then
        assertEquals(1, mainVM.getCounterMan().value)
    }

    @Test
    fun `reduce counter man should decreased 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterMan()
        mainVM.reduceCounterMan()

        // Then
        assertEquals(0, mainVM.getCounterMan().value)
    }

    @Test
    fun `reduce counter man should decreased 0 value when it's already 0`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.reduceCounterMan()

        // Then
        assertEquals(0, mainVM.getCounterMan().value)
    }

    @Test
    fun `add counter kids should added 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterKid()

        // Then
        assertEquals(1, mainVM.getCounterKid().value)
    }

    @Test
    fun `reduce counter kids should decreased 1 value`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.addCounterKid()
        mainVM.reduceCounterKid()

        // Then
        assertEquals(0, mainVM.getCounterKid().value)
    }

    @Test
    fun `reduce counter kids should decreased 0 value when it's already 0`() {
        // Given
        val mainVM = MainViewModel()

        // When
        mainVM.reduceCounterKid()

        // Then
        assertEquals(0, mainVM.getCounterKid().value)
    }
}