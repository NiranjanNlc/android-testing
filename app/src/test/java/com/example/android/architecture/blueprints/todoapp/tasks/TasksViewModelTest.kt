package com.example.android.architecture.blueprints.todoapp.tasks

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TasksViewModelTest : TestCase() {

    fun testAddNewTask() {
         // Given a fresh ViewModel
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
        // When adding a new task
        tasksViewModel.addNewTask()
    }
}