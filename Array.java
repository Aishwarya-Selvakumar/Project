package practice.Test;

public class array {
    public static void main (String[]args){
int A [][]= {{1,3,4},{2,4,3},{3,4,5}};
int B [][]= {{1,3,4},{2,4,3},{1,2,4}};
int sum [][]= new int [3][3];
for (int i=0; i<3 ; i++){
    for (int j=0; j<3 ; j++){
        sum[i][j]= A[i][j]+ B[i][j];
            System.out.print(sum[i][j]+"");

        }
System.out.println();
    }
}

    }
