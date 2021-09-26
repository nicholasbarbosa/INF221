package main;

public class Impedidos {
    private boolean i;

    public Impedidos(){
        i = false;
    }

    public boolean geti(){
        return this.i;
    }

    public void resultado(int A, int B, int[] nA, int[] nB){
        for (int j = 0; j < A; j ++)
            if(nA[j] < nB[B-1]) {
                this.i = true;
                break;
            }
    }
}
