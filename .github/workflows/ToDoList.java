package com.keyin;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoList {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
        } else {
            System.out.println("Invalid task index:  " + index);
        }
    }

    public List<Task> getTasksByPriority() {
            return tasks.stream()
                    .sorted(Comparator.comparingInt(Task::getPriority))
                    .collect(Collectors.toList());
        }

    public List<Task> getTasksByDueDate() {
            return tasks.stream()
                    .sorted(Comparator.comparing(Task::getDueDate))
                    .collect(Collectors.toList());
        }

    public List<Task> getTasksByCategory(String category) {
        return tasks.stream()
                .filter(task -> (task.getCategory() == null && category == null) ||
                        (task.getCategory() != null && task.getCategory().equalsIgnoreCase(category)))
                .collect(Collectors.toList());
    }
    /**
    public void updateTaskPriority(int index, int newPriority) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setPriority(newPriority);
        } else {
            System.out.println("Invalid task index: " + index);
        }


    public void updateTaskDueDate(int index, LocalDate ;newDueDate) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDueDate(newDueDate);
        } else {
            System.out.println("Invalid task index: " + index);
        }
    }

    public void updateTaskCategory(int index, String newCategory) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCategory(newCategory);
        } else {
            System.out.println("Invalid task index: " + index);
        }
    }
    }
     */
    }