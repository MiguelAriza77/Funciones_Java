public class Main {
    public static void main(String[] args) {
        //Primer paso
        sumar(3, 7, 10);
        Coche miCoche = new Coche();
        miCoche.ColocarPuerta();
        miCoche.ColocarPuerta();
        miCoche.ColocarPuerta();
        miCoche.ColocarPuerta();
        System.out.println("Su coche tiene: " + miCoche.puertas + " puertas");
    }
    //Primer paso
    public static void sumar(int a, int b, int c) {
        int resultado1 = a + b;
        int resultado2 = a + c;
        int resultado3 = c + b;
        System.out.println(a + " + " + b + " = " + resultado1);
        System.out.println(a + " + " + c + " = " + resultado2);
        System.out.println(c + " + " + b + " = " + resultado3);

    }
    static class Coche {
        public int puertas = 0;

        public void ColocarPuerta() {
            this.puertas++;
        }

    }

}