import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro");
        int parametro1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o segundo parâmetro");
        int parametro2 = scanner.nextInt();
        scanner.nextLine();

        try{
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 >= parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contador = parametro2 - parametro1;
        System.out.println("Imprimindo os números de " + parametro1 + " a " + parametro2);
        for(int i = contador; i <= parametro2; i++){
            System.out.println(parametro1);
            parametro1 ++;
        }
    }
}
