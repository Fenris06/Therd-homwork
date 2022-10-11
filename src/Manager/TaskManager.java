package Manager;

import Tasks.Epic;
import Tasks.SubTask;
import Tasks.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private int generationId = 0;
    HashMap<Integer, Task> tasks = new HashMap<>();
    HashMap<Integer, SubTask> subTasks = new HashMap<>();
    HashMap<Integer, Epic> epics = new HashMap<>();

    public ArrayList<Task> getTasks(){
        return new ArrayList<>(tasks.values());
    }

    public void addTask(Task task){
        task.setId(generationId++);
        tasks.put(task.getId(), task);
    }

//    public void printAllTAsk() {
//        for (Object object : tasks.keySet()) {
//            Task values = tasks.get(object);
//            System.out.println("tasks id " + object + " " + values );
//        }
//    }

    public void addSubtask(SubTask subTask){
        int epicId = subTask.getEpicId();
        Epic epic =epics.get(epicId);
        if (epic == null) {
            return;
        }
        subTask.setId(generationId++);
        subTasks.put(subTask.getId(), subTask);
        epic.addSubtaskId(subTask.getId());

        updateEpicStatus(epic);
    }

    public void addEpic(Epic epic) {
        epic.setId(generationId++);
        epics.put(epic.getId(), epic);
    }

    private void updateEpicStatus(Epic epic) {
        ArrayList<Integer> subTasksId = epic.getSubTaskIds();
        if (subTasksId.isEmpty()) {
            epic.setStatus("NEW");
            return;
        }
        String status = null;
        for (int subtasksId: subTasksId) {
            SubTask subTask = subTasks.get(subtasksId);
            if (status == null) {
                status = subTask.getStatus();
                continue;
            }
            if (status.equals(subTask.getStatus())) {
                continue;
            }
            epic.setStatus("IN_PROGRESS");
            return;
        }
        epic.setStatus(status);

    }
}

