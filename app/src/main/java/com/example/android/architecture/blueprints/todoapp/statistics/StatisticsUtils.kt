

package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task


internal fun getActiveAndCompletedStats(tasks: List<Task>?): StatsResult {
     val numberOfActiveTasks = tasks?.count { it.isActive }
    return  if (tasks.isNullOrEmpty())
     StatsResult(0f ,0f ) else
    StatsResult(
        activeTasksPercent = 100f * numberOfActiveTasks!! / tasks.size,
        completedTasksPercent = 100f * (tasks.size- numberOfActiveTasks) / tasks.size
    )
}

data class StatsResult(val activeTasksPercent: Float, val completedTasksPercent: Float)
