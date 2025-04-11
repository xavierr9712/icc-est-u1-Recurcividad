public class App {
    public static void main(String[] args) throws Exception {
// los metodos estaticos pueden  llamar solo a metodos estaticos
        int n= 5;
        
        System.out.println("Factorial: ");
        int resultadoFinal = factorial(n);
        System.out.println("resultado:" + resultadoFinal);
        System.out.println();

        EjerciciosRecurcivos e = new EjerciciosRecurcivos ();

        System.out.println("fibonacci: ");
        System.out.println();
        int nuf = 6;
        int fibo = e.fibonacci (nuf);
        System.out.println("fibonacci en la posicion: "+ nuf + " es: " + fibo);
        System.out.println();

        System.out.println("getPotencia: ");
        System.out.println();
        int base = 3;
        int exponente = 2;
        int getp = e.getPotencia(base,exponente);
        System.out.println(base + "^" + exponente + "=" +getp);
        System.out.println();

        System.out.println("sumaDigitos: "); 
        System.out.println();
        int numeroO3 = 345;
        int sumad = e.sumaDigitos(numeroO3);
        System.out.println("suma de los digitos: " + numeroO3 + " es: "  + sumad);
        System.out.println();

        System.out.println("imprimirDescendente: ");
        System.out.println();
        int numeroOriginal4 = 8;
        System.out.print("Imprimiendo desde " + numeroOriginal4 + " hasta 1: ");
        e.imprimirDescendente (numeroOriginal4); 
        System.out.println();
        

        System.out.println("reverso: ");
        System.out.println();
        int numeroOriginal5 = 1234;
        int numeroInvertido5 = e.reverso(numeroOriginal5);
        System.out.println("El reverso de " + numeroOriginal5 + " es: " + numeroInvertido5);


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
