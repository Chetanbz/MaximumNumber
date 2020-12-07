public class MaximumNumber <E extends Comparable<E>>{
    public static void main(String [] args){


    }
    public E maximum(E ...a){
        E max = a[0];
        for(E i :a){
            if(i.compareTo(max)>0) max = i;
        }
        return max;
    }
    public void print(E max){
        System.out.println(max);
    }
}
