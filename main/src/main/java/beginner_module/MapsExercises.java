package beginner_module;

import java.util.HashMap;
import java.util.Map;

public class MapsExercises {
    /**
     *  Un HashMap este o structura de date care stocheaza perechi cheie-valoare.
     *  Cheia trebuie sa fie unica
     *  Valoarea poate fi orice obiect Java
     */

    public static void main(String[] args) {
        // Cum declaram un HashMap?

        // Declaram un HashMap unde cheia e String si valoarea Integer
        HashMap<String, Integer> employeeIds = new HashMap<>();

        // Adaugam perechi cheie-valoare
        employeeIds.put("John", 12345);
        employeeIds.put("Carl", 54321);
        employeeIds.put("Jerry", 8675309);

        // Afisam HashMap-ul
        System.out.println(employeeIds); // Observatie: HashMap nu garanteaza ordinea elementelor.

        // Cum accesam valori intr-un HashMap?
        System.out.println(employeeIds.get("Carl")); // Daca cheia nu exista, .get() returneaza null.

        // Cum verificam daca o cheie exista?
        System.out.println(employeeIds.containsKey("Jerry")); // true
        System.out.println(employeeIds.containsKey("George")); // false

        // Verificam daca o valoare exista:
        System.out.println(employeeIds.containsValue(8675309)); // true

        // Cum actualizam o valoare?
        employeeIds.put("John", 98765); // Suprascrie valoarea pentru John
        employeeIds.replace("John", 77777);
        employeeIds.replace("Steve", 99999); // Nu se intampla nimic, Steve nu exista
        employeeIds.putIfAbsent("Steve", 22222); // Steve nu exista, deci e adaugat

        // Cum stergem o pereche cheie-valoare?
        employeeIds.remove("Steve"); // Sterge Steve din HashMap

        // Eroare comuna: daca incerci sa folosesti un tip primitiv intr-un HashMap, vei primi o eroare:
//        HashMap<String, int> numbers = new HashMap<>(); => Nu functioneaza.
        HashMap<String, Integer> numbers2 = new HashMap<>(); // Functioneaza.

        /*
         * Recapitulare HashMap:
         * HashMap stocheaza perechi cheie-valoare.
         * Cheile sunt unice, valorile pot fi duplicate.
         * Acces rapid la date prin .get(cheie).
         * Metode importante: .put(), .get(), .containsKey(), .remove(), .replace(), .putIfAbsent().
         * Foloseste wrapper classes pentru tipuri primitive (Integer in loc de int, Double in loc de double).
         */

        /*
         * Cum parcurgem un HashMap:
         * Folosind forEach() cu o functie lambda (Java 8+)
         * Folosind entrySet() si un for-each loop
         */
        // Lambda Function cu forEach() pe un HashMap (Java 8+)
        employeeIds.forEach((key, value) -> System.out.println(key + " -> " + value));
        // (key, value) -> { corpul functiei }
        // key si value sunt parametrii functiei.
        // System.out.println(key + " -> " + value); este corpul functiei.

        System.out.println("----------------------------");

        for (Map.Entry<String, Integer> entry : employeeIds.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /*
         * Ce face entrySet()? entrySet() returneaza toate perechile cheie-valoare.
         *
         * employeeIds.entrySet() returnează toate perechile cheie-valoare sub formă de Set<Map.Entry<K, V>>
         * Fiecare pereche este un obiect Map.Entry<K, V>. => in cazul nostru Map.Entry<String, Integer> entry
         * for parcurge fiecare entry (pereche cheie-valoare) din acest set.
         * entry.getKey() ia cheia, entry.getValue() ia valoarea.
         *
         * Recapitulare:
         * Lambda function = functie anonima, folosita pentru a scrie cod mai scurt si clar.
         * Map.Entry = un obiect care contine o pereche cheie-valoare dintr-un Map.
         * Folosim entrySet() + Map.Entry pentru a itera eficient printr-un HashMap.
         */
    }
    /*
    --------------------------------------------------------
    Tema: Lucru cu HashMap in Java
    --------------------------------------------------------

    Creeaza doua HashMap-uri diferite:
       - Un HashMap<String, String> pentru nume si oras.
       - Un HashMap<String, String> pentru produse si preturi (ex: "Laptop" -> "5000 RON").

    Creeaza cate o functie pentru fiecare metoda comuna folosita cu HashMap:
       - put() → adauga o pereche cheie-valoare.
       - get() → returneaza valoarea pentru o cheie data.
       - containsKey() → verifica daca o cheie exista.
       - remove() → sterge o pereche cheie-valoare.
       - replace() → inlocuieste valoarea unei chei existente.
       - putIfAbsent() → adauga o valoare doar daca cheia nu exista deja.

    Creeaza 3 functii pentru iterare cu entrySet():
       - Foloseste for-each pentru a parcurge entrySet().
       - Printeaza fiecare pereche cheie-valoare.

    Creeaza 3 functii pentru iterare cu lambda function:
       - Foloseste .forEach() pentru a itera prin HashMap.
       - Printeaza fiecare pereche cheie-valoare.

    In main(), apeleaza toate functiile.

    --------------------------------------------------------
    */
}

