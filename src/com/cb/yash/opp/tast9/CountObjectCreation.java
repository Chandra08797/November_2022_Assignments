package com.cb.yash.opp.tast9;

public class CountObjectCreation {
    static int count;
    CountObjectCreation(){
        count++;
    }

    public static void main(String[] args) {
        CountObjectCreation coc = new CountObjectCreation();
        CountObjectCreation coc1 = new CountObjectCreation();
        CountObjectCreation coc2 = new CountObjectCreation();
        CountObjectCreation coc3 = new CountObjectCreation();
        CountObjectCreation coc4 = new CountObjectCreation();

        System.out.println(coc.hashCode());
        System.out.println(coc3.hashCode());

        coc=null;
        CountObjectCreation coc5 = coc3;

        System.gc();
        System.out.println(CountObjectCreation.count);
    }

    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
        System.out.println();
    }
}
