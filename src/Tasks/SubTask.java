package Tasks;




import java.util.ArrayList;

public class SubTask extends Task {
    private int epicId;

    public SubTask(String name,  String specification, String status) {
        super(name, specification, status);

    }

    public SubTask(String name, int Id, String specification, String status) {
        super(name, Id, specification, status);

    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
