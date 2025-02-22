
package javaapplication1;

import java.util.*;



public class JavaApplication1 {
   private static ArrayList<String> tasks=new ArrayList<>();
     private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       while (true){
          System.out.println("\n===== To-Do List =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 :
                    Addtask();
                    break;
                case 2 :
                    Viewtasks();
                    break;
                case 3 :
                    Removetask();
                    break;
                case 4 :
                    System.out.println("Exiting... Goodbye!");
                    return;
                default :
                     System.out.println("Invalid option. Try again.");
            }
         }
        }
    private static void Addtask(){
          System.out.print("Enter the task: ");
          String task = scanner.nextLine();
          tasks.add(task);
          System.out.println("Task added successfully!");
          }
    
    private static void Viewtasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks found.");
        }else{
            System.out.println("\nYour To-Do List:");
            for(int i = 0 ; i < tasks.size(); i++){
                System.out.println((i+1) + "." + tasks.get(i));
             }
        }
        
    }

    private static void Removetask(){
        if(!tasks.isEmpty()){
             System.out.print("Enter the task number to remove: ");
             int index = scanner.nextInt();
             scanner.nextLine();
             if(index > 0 && index<=tasks.size()){
                 tasks.remove(index-1);
                 System.out.println("Task removed successfully!");
             }else{
                 System.out.println("Invalid task number.");
             }
        }else{
            System.out.println("No tasks found.");
        }
    }
}
