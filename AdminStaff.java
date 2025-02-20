class AdminStaff extends UniversityStaff {
    private String role;

    public AdminStaff(String name, String staffID, String department, String role) {
        super(name, staffID, department);
        this.role = role;
    }

    @Override
    public void displayRole() {
        System.out.println("Admin Staff: " + name + ", Role: " + role);
    }
}
