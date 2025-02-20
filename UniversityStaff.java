class UniversityStaff {
    protected String name;
    protected String staffID;
    protected String department;

    public UniversityStaff(String name, String staffID, String department) {
        this.name = name;
        this.staffID = staffID;
        this.department = department;
    }

    public void displayRole() {
        System.out.println("University Staff: " + name + " (" + department + ")");
    }
}

class Professor extends UniversityStaff implements Researcher, Mentor {
    private String specialization;

    public Professor(String name, String staffID, String department, String specialization) {
        super(name, staffID, department);
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Professor: " + name + ", Specialization: " + specialization);
    }

    @Override
    public void conductResearch() {
        System.out.println(name + " is conducting research.");
    }

    @Override
    public void guideStudents() {
        System.out.println(name + " is guiding students.");
    }
}