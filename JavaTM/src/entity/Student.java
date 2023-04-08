package entity;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.id = ++autoId;
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }

    public Student() {
        this.id = ++autoId;
    }

    public String getName() {
        return name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " - tên: " + name+
                " - điểm Toán: " + scoreMath +
                " - điểm Vật lý: " + scorePhysic +
                " - điểm Hóa học: " + scoreChemistry;
    }
}
