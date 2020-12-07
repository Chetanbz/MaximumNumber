public class MaximumNumber <E extends Comparable<E>>{
    public static void main(String [] args){

    }
    public E maximum(E x, E y, E z){
        E max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
}
