class Course {
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName);
    }

    public void enrollStudent(String studentName, String studentID) {
        System.out.println("Enrolling " + studentName + " (" + studentID + ")");
    }
}

class OnlineCourse extends Course {
    public void conductClass() {
        System.out.println("Conducting online class.");
    }
}

class OfflineCourse extends Course {
    public void conductClass() {
        System.out.println("Conducting offline class.");
    }
}
