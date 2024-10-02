package com.keyin;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This is my Travel To Do List");
        System.out.println();
        for (int i = 1; i <= 8; i++) {
          //  System.out.println("i = " + i);
        }
        System.out.println();

        // Move the code inside the main method
        ToDoList toDoList = new ToDoList();

        Task task1 = new Task("Pick up medications", 1, LocalDate.of(2024, 10, 27), "Personal");
        Task task2 = new Task("Gather school sprint project notes", 2, LocalDate.of(2024, 10, 27), "School");
        Task task3 = new Task("Gather up all electronics and chargers", 1, LocalDate.of(2024, 10, 27), "Personal");
        Task task4 = new Task("Get bag for plane ready (ie meds, laptop, charger, hand sanitizer, novel and snacks ", 3, LocalDate.of(2024, 10, 28), "Personal");
        Task task5 = new Task("Pack my suitcase", 3, LocalDate.of(2024, 10, 27), "Personal");
        Task task6 = new Task("Gather uo my passport ready, my Florida Resident card, my US car insurance policy and pack in carry-on ", 1, LocalDate.of(2024, 10, 27), "Personal");
        Task task7 = new Task("Get dressed for plane and leave for airport two hours before flight", 1, LocalDate.of(2024, 10, 28), "Personal");
        Task task8 = new Task("Drop into the office to get work files for meetings", 3, LocalDate.of(2024, 10, 25), "Work");

        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);
        toDoList.addTask(task5);
        toDoList.addTask(task6);
        toDoList.addTask(task7);
        toDoList.addTask(task8);

        List<Task> tasks = toDoList.getTasks();
        for (Task task : tasks) {
            System.out.println("Task: " + task.getDescription() + ", Priority: " + task.getPriority());
        }
        System.out.println();
    }
}