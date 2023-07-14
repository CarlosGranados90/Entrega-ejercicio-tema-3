public class Main {

    public static void main(String[] args) {

        // Bucle for
        String[] nombres1 = {"Natha", "Carlos", "Sara"};
        int i;
        for (i = 0; i < nombres1.length; i++) {
             System.out.println("Nombres: " + nombres1[i]);
        }

        // Bucle foreach
        String[] nombres2 = {"Acuña", "Morales", "Silva"};
        for (String n : nombres2) {
             System.out.println("Apellidos: " + n );
        }

        //Bucle while
        int edad = 0;
        while (edad < 7) {
            String[] nombres3 = {"Wendy", "David", "Patricia", "Sofia"};
            edad++;
            if (edad == 4) {
                break;
                //continue;
            }
            System.out.println("La edad es: " + edad);
        }
    }
}