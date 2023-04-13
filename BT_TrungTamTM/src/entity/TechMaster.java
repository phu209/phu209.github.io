package entity;

public class TechMaster {
    private String manager;
    private String teacher;
    private ClassRoom classRoom;

    public TechMaster(String manager, String teacher, ClassRoom classRoom) {
        this.manager = manager;
        this.teacher = teacher;
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                " manager= " + manager +
                ", teacher= " + teacher +
                ", \n classRoom= " + classRoom +
                '}';
    }
}
