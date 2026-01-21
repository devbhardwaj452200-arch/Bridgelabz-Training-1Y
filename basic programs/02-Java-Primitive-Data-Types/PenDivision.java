public class PenDivision {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("Each student will get " + pensPerStudent + " pens.");
        System.out.println("Remaining non-distributed pens = " + remainingPens);
    }
}
