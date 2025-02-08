import java.util.*;
public class LRDIAGONALSUM {
   public static void main(String Args[]){
    int a[][]=new int[4][4];
    int i,j,ls=0,rs=0;
    Scanner in=new Scanner(System.in);
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            a[i][j]=in.nextInt();
        }
    }
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            if(i+j==3)
            rs+=a[i][j];
            if(i==j)
            ls+=a[i][j];
        }
    }
    System.out.println("Sum of Right Diagonal Elements: "+rs);
    System.out.println("Sum of Left Diagonal Elements: "+ls);
   }
}
