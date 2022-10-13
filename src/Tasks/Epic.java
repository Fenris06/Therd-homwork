package Tasks;

import java.util.ArrayList;

public class Epic extends Task{
    private ArrayList<Integer> subTaskIds;

    public Epic(String name, int Id, String specification, String status) {
        super(name, Id, specification, status);
        subTaskIds = new ArrayList<>();
    }


    public void addSubtaskId(int subTaskId) {
        subTaskIds.add(subTaskId);
    }

    public ArrayList<Integer> getSubTaskIds() {
        return subTaskIds;
    }

    public void removeSubTaskId (int subTasksId){
        subTaskIds.remove(Integer.valueOf(subTasksId));
    }

    public void clearSubTaskId() {
        subTaskIds.clear();
    }
}
