public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("joankii"  , 80 , 80 , 80 , 80 );

    } /* Dengan Variable Argument */
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("selamat" + name + "anda lulus");
        } else {
            System.out.println("maaf" + name + "anda tidak lulus");
        }
    }
}
