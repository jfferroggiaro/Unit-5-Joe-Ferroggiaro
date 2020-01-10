public class Task implements Priority{
    private String name;
    private int priority;
    private Boolean isComplete;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
        isComplete = false;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    public void doTask(){
        System.out.println("Completing Task...");
        isComplete = true;
        System.out.println("Task Complete.");
        this.setPriority(0);
    }

    @Override
    public String toString() {
         return ("Task: " + name + "\nPriority: " + this.getPriority() + "\nStatus: " + isComplete);
    }
}
