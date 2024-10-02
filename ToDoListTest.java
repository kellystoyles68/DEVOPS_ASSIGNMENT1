package com.keyin;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class ToDoListTest {
    private ToDoList toDoList;

    @Before
    public void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("Drop into CandleLighter's Christmas Party before going to the airport", 5, LocalDate.of(2024,12,14), "Personal");
        toDoList.addTask(task);
        Assert.assertEquals(1, toDoList.getTasks().size());
    }

    @Test
    public void testCompleteTask() {
        Task task = new Task(" Packed carry-on", 1, LocalDate.of(2024,10,26), "Personal");
        toDoList.addTask(task);
        toDoList.completeTask(0);
        Assert.assertTrue(toDoList.getTasks().get(0).isCompleted());
    }

    @Test
    public void testGetTasksByPriority() {
        Task task2 = new Task("Gather school work", 2, LocalDate.of(2024, 10, 26), "School");
        Task task1 = new Task("Get meds", 1, LocalDate.now().plusDays(1), "Personal");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        List<Task> sortedTasks = toDoList.getTasksByPriority();
        Assert.assertEquals("Get meds", sortedTasks.get(0).getDescription());
        System.out.println(sortedTasks.get(0).getDescription());
    }

    @Test
    public void testGetTasksByDueDate() {
        Task task4 = new Task("Get bag for plane ready (ie meds, laptop, charger, hand sanitizer, novel and snacks", 3, LocalDate.now(), "Personal");
        Task task5 = new Task("Pack my suitcase", 3, LocalDate.now().plusDays(1), "Personal");
        toDoList.addTask(task4);
        toDoList.addTask(task5);
        List<Task> sortedTasks = toDoList.getTasksByDueDate();
        Assert.assertEquals("Get bag for plane ready (ie meds, laptop, charger, hand sanitizer, novel and snacks", sortedTasks.get(0).getDescription());
        System.out.println(sortedTasks.get(0).getDescription());
    }

    @Test
    public void testGetTasksByCategoryIncludingNull() {
        Task task1 = new Task("Task 1", 2, LocalDate.now(), "Work");
        Task task2 = new Task("Task 2", 1, LocalDate.now().plusDays(1), null);
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        List<Task> nullCategoryTasks = toDoList.getTasksByCategory(null);
        Assert.assertEquals(1, nullCategoryTasks.size());
        Assert.assertEquals("Task 2", nullCategoryTasks.get(0).getDescription());
    }
}
