import java.util.*;

public class Ejercicio3 {

    public static final int BOUND = 49;

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> randoms = new ArrayList<>();

        Random aleatorio = new Random();

        Scanner entrada = new Scanner(System.in);

        int inputUser;

        for (int i = 0; i < 6; i++) {

            do {
                System.out.print("Introduzca un numero entre 1 y 49: ");
                inputUser = entrada.nextInt();
            } while (ifExistInTheList(numeros, inputUser) || !isInRange(inputUser));

            numeros.add(inputUser);

            randoms.add(generateRandomValue(randoms, aleatorio));
        }

        Collections.sort(randoms);

        System.out.println(numeros);
        System.out.println(randoms);

        evaluateBingo(numeros,randoms);

    }

    private static void evaluateBingo(List<Integer> numeros, List<Integer> randoms) {
        int aciertos = 0;
        for(Integer numero: numeros){
            if (randoms.contains(numero)){
                aciertos++;
            }
        }
        System.out.println("Cantidad de aciertos: " + aciertos);
    }

    private static boolean isInRange(int inputUser) {
        boolean result = inputUser >= 1 && inputUser <= 49;
        if(!result){
            System.out.println("El numero esta fuera de rango, ingrese otro!");
        }
        return result;
    }

    private static int generateRandomValue(List<Integer> random, Random aleatorio) {
        int result;
        do {
            result = aleatorio.nextInt(BOUND) + 1;
        } while (random.contains(result));
        return result;
    }

    private static boolean ifExistInTheList(List<Integer> numeros, int n) {
        boolean result = numeros.contains(n);
        if(result){
            System.out.println("El numero ya a sido ingresado");
        }
        return result;
    }
}
