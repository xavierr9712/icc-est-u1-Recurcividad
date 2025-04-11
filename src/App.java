public class App {
    public static void main(String[] args) throws Exception {
// los metodos estaticos pueden  llamar solo a metodos estaticos
        int n= 5;
        int resultadoFinal = factorial(n);
        System.out.println("resultado:" + resultadoFinal);
        EjerciciosRecurcivos e = new EjerciciosRecurcivos ();
        int fibo = e.fibonacci (5);
        System.out.println(fibo);
        int getp = e.getPotencia(3,2);
        System.out.println(getp);
        int sumad = e.sumaDigitos(422);
        System.out.println(sumad);
    }
   public static int  factorial(int n){
    if(n==0){
        System.out.println("Alcanse el caso base");
        return 1;
       
    }
    int resultado = n * factorial(n-1);
    System.out.println("Calcular factorial de: "+ n + "* factorial(" + (n-1) + " -1)");
    return resultado;
    }

    
    
    
    
    
   
    
    
}
