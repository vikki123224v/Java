public class MultiDArray {
    public static void main(String[] args) {
        int arr[][][]={
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                {10,11,12},
                {13,14,15},
                {16,17,18}
            },
            {
                {19,20,21},
                {22,23,24},
                {25,26,27}
            }
        };
        for (int i = 0; i < arr.length; i++) {//2D arrays
            System.out.println("2D array at index "+i);
            for (int j = 0; j < arr[i].length; j++) {//rows
                for (int k = 0; k < arr[i][j].length; k++) {//columns
                    System.out.print(arr[i][j][k]+" ");//we have to give arr[i][j][k]because its 3D array,if not given it will give error when the element is removed from the 2D array.
                }
                System.out.println();
            }
            System.out.println();
        }   
    }
}