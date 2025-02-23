package javaapplication1;

import java.util.*;

public class JavaApplication1 {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== To-Do List =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Edit Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    editTask();
                    break;
                case 5:
                    markTaskAsCompleted();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        if (!tasks.isEmpty()) {
            System.out.print("Enter the task number to remove: ");
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index > 0 && index <= tasks.size()) {
                tasks.remove(index - 1);
                System.out.println("Task removed successfully!");
            } else {
                System.out.println("Invalid task number.");
            }
        } else {
            System.out.println("No tasks found.");
        }
    }

    private static void editTask() {
        if (!tasks.isEmpty()) {
            System.out.print("Enter the task number to edit: ");
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index > 0 && index <= tasks.size()) {
                System.out.print("Enter the new task: ");
                String newTask = scanner.nextLine();
                tasks.set(index - 1, newTask);
                System.out.println("Task edited successfully!");
            } else {
                System.out.println("Invalid task number.");
            }
        } else {
            System.out.println("No tasks found.");
        }
    }

    private static void markTaskAsCompleted() {
        if (!tasks.isEmpty()) {
            System.out.print("Enter the task number to mark as completed: ");
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index > 0 && index <= tasks.size()) {
                String task = tasks.get(index - 1);
                tasks.set(index - 1, task + " (Completed)");
                System.out.println("Task marked as completed!");
            } else {
                System.out.println("Invalid task number.");
            }
        } else {
            System.out.println("No tasks found.");
        }
    }
} 
