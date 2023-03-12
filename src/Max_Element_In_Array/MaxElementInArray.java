package Max_Element_In_Array;

public class MaxElementInArray {
    private int[] ints;
    public MaxElementInArray(int[] ints){
        this.ints = ints;
    int max = 0;
    for (int i=0;i< ints.length;i++){
        if (ints[i]>max){max = ints[i];}
        }
        System.out.println("Max Element in Array is : "+max);
    }

}
