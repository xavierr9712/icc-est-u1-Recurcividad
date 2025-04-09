public class EjerciciosRecurcivos {

    public int fibonacci (int n) {
        // otra forma 
        // if (n==0|| n n==1){
        //     return n;
        //}
        //return fibonacci (n-1) + fibonacci(n-2);
        // otra forma
        // if (n<=1){
        //     return n;
        //}
        //return fibonacci (n-1) + fibonacci(n-2);
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        return fibonacci (n-1) + fibonacci(n-2);
    }


    public int sumaConsecutivos (int n) {

        if (n==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
            int resultado = n + resultadoParcial;
            return resultado;



    }
    
}
