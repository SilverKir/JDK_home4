public class Employee {
    private int personnelNumber;
    private String phoneNumber;
    private String name;
    private int experience;



    public Employee(int personnelNumber, String phoneNumber, String name, int experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }


    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getId() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + personnelNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                "}\n";
    }
}
