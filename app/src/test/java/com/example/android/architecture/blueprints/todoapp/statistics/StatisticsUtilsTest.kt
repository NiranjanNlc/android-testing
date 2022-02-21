package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import junit.framework.TestCase
import org.junit.Test

class StatisticsUtilsTest : TestCase() {

    @Test
    fun testGetActiveAndCompletedStats()
    {
        // Create an active task
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false)
        )
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 100f)
    }@Test
    fun testGetActiveAndCompletedStats_empty_retuerns_zero()
    {
        // Create an active task
        val tasks = listOf<Task>()
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 0f)
    }@Test
    fun testGetActiveAndCompletedStats_noactice_returns_zeroHundred()
    {
        // Create an active task
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = true)
        )
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertEquals(result.completedTasksPercent, 100f)
        assertEquals(result.activeTasksPercent, 0f)
    }
    @Test
    fun testGetActiveAndCompletedStats_noComplete_returns_HundredZero()
    {
        // Create an active task
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false)
        )
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertEquals(result.activeTasksPercent, 100f)
        assertEquals(result.completedTasksPercent, 0f)

    }
    @Test
    fun testGetActiveAndCompletedStats_Error_Returns_zero()
    {
        val result = getActiveAndCompletedStats(null)
        // Check the result
        assertEquals(result.completedTasksPercent, 0f)
        assertEquals(result.activeTasksPercent, 00f)
    }
    fun testGetActiveAndCompletedStats_returns_FortySixity()
    {
        // Create an active task
        val tasks = listOf<Task>(
            Task("title", "desc", isCompleted = false),
                    Task("title", "desc", isCompleted = false),
        Task("title", "desc", isCompleted = false),
        Task("title", "desc", isCompleted = true),
        Task("title", "desc", isCompleted = true),
        )
        val result = getActiveAndCompletedStats(tasks)
        // Check the result
        assertEquals(result.completedTasksPercent, 40f)
        assertEquals(result.activeTasksPercent, 60f)
    }
}