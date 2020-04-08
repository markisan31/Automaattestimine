public class Course {

    public String courseName;
    public int sumOfEAP;
    public int maxStudentsQuantity;

    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName, int sumOfEAP, int maxStudentsQuantity) {
        this.courseName = courseName;
        this.sumOfEAP = sumOfEAP;
        this.maxStudentsQuantity = maxStudentsQuantity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSumOfEAP() {
        return sumOfEAP;
    }

    public void setSumOfEAP(int sumOfEAP) {
        this.sumOfEAP = sumOfEAP;
    }

    public int getMaxStudentsQuantity() {
        return maxStudentsQuantity;
    }

    public void setMaxStudentsQuantity(int maxStudentsQuantity) {
        this.maxStudentsQuantity = maxStudentsQuantity;
    }
}
