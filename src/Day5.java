/*void main(){
    int [] name=("student 1","student 2");
    int marks[][] marks = {
            {89, 57, 48},
            {75, 86, 85}
    };
    System.out.println();
    System.out.println("S.no/tname/tMaths/tPhysics/tChemistry/tTotal/t/tAverage");
    for(int i=0;i<marks.lenth;i++){
        int total=marks[i][0]+marks[i][1]+marks[i][2];
        System.out.println("%d/t%s/t%d/t%d/t%d/t/t%d/t%2f/n");
    }
}
 */

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.println("Enter your department:");
    String dept = sc.nextLine();
    System.out.println("Enter your age:");
    String age = sc.nextLine();
    System.out.println();
    System.out.println("Details:");
    System.out.println("Name:" + name);
    System.out.println("Dept:" + dept);
    System.out.println("Age:" + age);
}
