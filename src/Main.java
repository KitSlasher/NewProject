//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new Arraylist<>();
        list.add("Банан");
        list.add("Яблоко");
        list.add("Молоко");
        list.remove(1);
        list.contains("Кефир")
    }
    public List<int> newList(List<int>){
        Treeset<int> treeSet = new TreeSet<>(List<int>)
    }
}
class Task{
    private String task;
    private int priority;

    public Task(String task, itn priority){
        this.task = task;
        this.priority = priority;
    }
    public int getPriority(){
        return preority;
    }
}
class ListTasks(){
    private List<Task> listTasks;

    public ListTasks(List<Task> listTasks){
        this.listTasks = listTasks;
    }
    public Task addTask(String task, int priority){
        listTasks.add(new Task(task, priority));
        return task;
    }
    public Task addTask(String task, int priority){
        listTasks.remove(priority);
        return task;
    }
    public List<Task> SortByTask(){
        Collections.sort(listTasks)
    }
}
