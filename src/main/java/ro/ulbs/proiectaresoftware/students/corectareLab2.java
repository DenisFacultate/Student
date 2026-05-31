package ro.ulbs.proiectaresoftware.students;
import java.util.*;

public class corectareLab2 {
        public static void main(String[] args) {
            Student s1 = new Student(112, "Ioan", "Popa", "TI21/1", 9.5);
            Student s2 = new Student(112, "Maria", "Oprea", "TI21/1", 8.0);
            Student s3 = new Student(120, "Alis", "Popa", "TI21/2", 9.8);
            Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1", 7.5);
            Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2", 8.9);

            List<Student> listaStudenti = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

            for (Student s : listaStudenti) {
                System.out.println(s);
            }

            System.out.println();

            boolean existaAlis = cautaInLista(listaStudenti, "Alis", "Popa", "TI21/2");
            System.out.println("Exista Alis Popa in lista? " + existaAlis);

            boolean existaMaria = cautaInLista(listaStudenti, "Maria", "Popa", "TI21/1");
            System.out.println("Exista Maria Popa in lista? " + existaMaria);
            System.out.println();

            Map<String, Student> mapStudenti = new HashMap<>();
            for(Student s : listaStudenti) {
                String cheieUnica = s.getPrenume() + "-" + s.getNume() + "-" + s.getFormatieDeStudiu();
                mapStudenti.put(cheieUnica, s);
            }

            boolean existaAlisO1 = cautaInMap(mapStudenti, "Alis", "Popa", "TI21/2");
            System.out.println("Exista Alis Popa ?" + existaAlisO1);

            boolean existaMariaO1 = cautaInMap(mapStudenti, "Maria", "Popa", "TI21/1");
            System.out.println("Exista Maria Popa ? " + existaMariaO1);
        }

        public static boolean cautaInLista(List<Student> lista, String prenume, String nume, String formatie) {
            for (Student s : lista) {
                if (s.getPrenume().equals(prenume) &&
                        s.getNume().equals(nume) &&
                        s.getFormatieDeStudiu().equals(formatie)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean cautaInMap(Map<String, Student> map, String prenume, String nume, String formatie) {
            String cheieCautata = prenume + "-" + nume + "-" + formatie;
            return map.containsKey(cheieCautata);
        }
    }

