package listas.lista01.numeros;

public class NumerosTest {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(10, 20, 5);
        System.out.println("Máximo: " + numeros.maximo());
        System.out.println("Mínimo: " + numeros.minimo());
    }
}

