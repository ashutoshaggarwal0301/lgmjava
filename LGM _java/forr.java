public class forr {
    public static void main(String[] args) {
        int [] marks={45,54,7,34,23};
        System.out.println("Length of array here is : ");
        System.out.println(marks.length);
        System.out.println("Elements of array are : ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // Printing using for loop
        System.out.println("Printing using for loop : ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        // In  reverse order
        System.out.println("Printing in reverse order : ");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for-each loop : ");
        // For-each loop in java
        for(int element:marks){
            System.out.println(element);
        }
    }
    
}
