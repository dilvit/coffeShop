package coffeTipes;

public class Coffe {
    private static Size[] sizing = Size.values();
    private static CoffeTipes[] types = CoffeTipes.values();
    private static Supplements[] supplements = Supplements.values();

    public static Size getSize(int i) {
        return sizing[i - 1];
    }


    public static void viewTypes() {
        for (CoffeTipes tipe : types) {
            System.out.println(tipe);
        }
    }
    public static CoffeTipes getTypes(int q) {
        return types[q - 1];
    }

    public static  void viewSupplements(){
        for(Supplements s : supplements){
            System.out.println(s);
        }
    }
    public static Supplements getSupplements(int s){
        return supplements[s - 1];
    }



}
