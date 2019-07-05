package coffeTipes;

import java.util.Scanner;

public class Result{
    private static int sizes;
    private static int vid;
    private static int supplements;
    public static void resultation(){
        Sugar sugar = new Sugar();
        Scanner sc = new Scanner(System.in);
        sizes = sc.nextInt();
        System.out.println("Choose a type of coffee");
        Coffe.viewTypes();
        vid = sc.nextInt();
        Coffe.viewSupplements();
        supplements =sc.nextInt();
        System.out.println("1.Add sugar");
        System.out.println("2.Do`nt add sugar");
        int sugarCount =sc.nextInt();
        if(sugarCount == 1){
            System.out.println("Type of Coffee " + Coffe.getTypes(vid) + " glass size " + Coffe.getSize(sizes) + sugar.getWithSug() + " additionally : " + Coffe.getSupplements(supplements));
        }
        else{
            System.out.println("Type of Coffee " + Coffe.getTypes(vid) + " glass size " + Coffe.getSize(sizes) + sugar.getWithoutSug() + " additionally : " + Coffe.getSupplements(supplements));
        }
    }

}