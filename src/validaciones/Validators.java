package validaciones;

public class Validators {
    public static Person[] copiarArreglo(java.util.List<models.Person> lista) {
        models.Person[] copia = new models.Person[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            models.Person p = lista.get(i);
            copia[i] = new models.Person(p.getName(), p.getAge());
        }
        return copia;
    }

    public static void validarOrdenamientoPorNombre(models.Person[] original, models.Person[] ordenado) {
        java.util.List<String> nombresOriginal = new java.util.ArrayList<>();
        for (models.Person p : original) {
            nombresOriginal.add(p.getName());
        }
        java.util.List<String> nombresOrdenado = new java.util.ArrayList<>();
        for (models.Person p : ordenado) {
            nombresOrdenado.add(p.getName());
        }
        java.util.Collections.sort(nombresOriginal);
        if (!nombresOriginal.equals(nombresOrdenado)) {
            throw new AssertionError("El arreglo no está ordenado correctamente por nombre.");
        }
    }

    public static void validarCasosEspeciales(models.Person[] ordenado) {
        for (models.Person p : ordenado) {
            if (p.getName() == null || p.getName().isEmpty()) {
                throw new AssertionError("El arreglo contiene nombres nulos o vacíos.");
            }
        }
    }
}
