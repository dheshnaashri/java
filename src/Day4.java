void main(){
    public class StudentReport {
        public static void main(String[] args) {

            int[][] studentMarks = {
                    {78, 90, 34},
                    {89, 65, 89},
                    {12, 34, 56},
                    {66, 12, 89},
                    {33, 77, 88}
            };

            printTable(studentMarks);
        }

        public static void printTable(int[][] studentMarks) {

            System.out.printf("%-5s %-10s %-5s %-5s %-5s %-7s %-7s%n",
                    "S.No", "Name", "M", "P", "C", "Total", "Avg");

            for (int i = 0; i < studentMarks.length; i++) {

                int total = 0;

                for (int j = 0; j < studentMarks[i].length; j++) {
                    total += studentMarks[i][j];
                }

                double average = (double) total / studentMarks[i].length;

                System.out.printf("%-5d %-10s %-5d %-5d %-5d %-7d %-7.2f%n",
                        i + 1,
                        "Student" + (i + 1),
                        studentMarks[i][0], // Maths
                        studentMarks[i][1], // Physics
                        studentMarks[i][2], // Chemistry
                        total,
                        average);
            }
        }
    }
}