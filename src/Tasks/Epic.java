package Tasks;

import java.util.ArrayList;

public class Epic extends Task{
    private ArrayList<Integer> subTaskId;

    public Epic(String name, int Id, String specification, String status) {
        super(name, Id, specification, status);
        subTaskId = new ArrayList<>();
    }

    public void addSubtaskId(int subtaskId) {
        subTaskId.add(subtaskId);
    }

    public ArrayList<Integer> getSubTaskIds() {
        return subTaskId;
    }
}
