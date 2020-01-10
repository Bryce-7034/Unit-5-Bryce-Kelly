import java.util.concurrent.TimeUnit;

public class Task implements Priority {
    private static int instances;
    private int priority;
    private String task;
    private boolean completion;

    public Task(int priority, String task){
        instances++;
        this.priority = priority;
        this.task = task;
        completion = false;
    }

    public void setPriority(int priority){this.priority = priority;}
    public int getPriority(){return priority;}
    public void doTask(){
        System.out.println("working...");
        try{TimeUnit.SECONDS.sleep(15);}
        catch(InterruptedException ie){
            Thread.currentThread().interrupt();
        }
        completion = true;}
    public boolean isComplete(){return completion;}
    public String toString(){
        String result = "";
        result += "task:"+task+"\n";
        result += "priority:"+this.getPriority()+"\n";
        result += "completion:"+this.isComplete()+"\n";
        return result;
    }
}
