abstract class UniversityMember {
    protected String name;
    protected String id;

    public UniversityMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void performRole();

    public void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class TeachingStaff extends UniversityMember {
    public TeachingStaff(String name, String id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println(name + " is teaching students.");
    }
}

class NonTeachingStaff extends UniversityMember {
    public NonTeachingStaff(String name, String id) {
        super(name, id);
    }

    @Override
    public void performRole() {
        System.out.println(name + " is managing university operations.");
    }
}
