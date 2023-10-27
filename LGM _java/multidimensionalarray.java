public class multidimensionalarray {
    public static void main(String[] args) {
        int [] marks;
        int [][] flats;
        flats=new int[2][3];
        flats[0][0]=107;
        flats[0][1]=1081;
        flats[0][2]=151;
        flats[1][0]=131;
        flats[1][1]=121;
        flats[1][2]=108;
        System.out.println(flats[0][1]);
        // Displaying using for loop
        for(int i=0;i<flats.length;i++){
        for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
        }
        System.out.println(" ");
        } 

    }
    
}
