package ua.lviv.lgs.domain;



import javax.persistence.*;


@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String level;

    @Column
    private int institut;

    @Column
    private int student;

    @Column
    private String adress;

    public University() {
    }

    public University(String name, String level, int institut, int student, String adress) {
        this.name = name;
        this.level = level;
        this.institut = institut;
        this.student = student;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getInstitut() {
        return institut;
    }

    public void setInstitut(int institut) {
        this.institut = institut;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", institut=" + institut +
                ", student=" + student +
                ", adress='" + adress + '\'' +
                '}';
    }
}
