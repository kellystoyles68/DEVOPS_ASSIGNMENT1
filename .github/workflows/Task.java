package com.keyin;
import java.time.LocalDate;

public class Task {
        private final String description;
        private boolean completed;
        private int priority; // 1 (High) to 5 (Low)
        private LocalDate dueDate;
        private String category;

        public Task( String description, int priority, LocalDate dueDate, String category) {
            this.description = description;
            this.completed = false;
            this.priority = priority;
            this.dueDate = dueDate;
            this.category = category;
        }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getCategory() {
        return category;
    }


    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }
}


