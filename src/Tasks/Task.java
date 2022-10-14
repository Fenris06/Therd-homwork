package Tasks;
import java.util.Objects;

public class Task {
    private String name;
    private int Id;
    private String specification;
    private String status;

    public Task(String name, String specification, String status) {
        this.name = name;
        this.specification = specification;
        this.status = status;
    }

    public Task(String name, int Id, String specification, String status) {
        this.name = name;
        this.Id = Id;
        this.specification = specification;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Id == task.Id && Objects.equals(name, task.name)
                && Objects.equals(specification, task.specification)
                && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id, specification, status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", taskId=" + Id +
                ", specification='" + specification + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

