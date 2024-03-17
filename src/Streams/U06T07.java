package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U06T07 {
    public static void main(String[] args) {
        Person p1= new Person("Juan", "Fernandez", 1999);
        Person p2= new Person("Juanico", "Fernando", 1989);
        Person p3= new Person("Juanillo", "Ferrando", 1994);
        Person p4= new Person("Juanito", "Aernan", 2000);
        Person p5= new Person("Cincuento", "Herrero", 1960);

        List<Person> personas = new ArrayList<>();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        //Ejerciico 1:
        System.out.println("Cantidad de personas nacidas antes de 1970: "+personas.stream().filter(person -> person.getBirthYear() < 1970).count());

        //Ejercicio 2:
        System.out.println("Cantidad de personas cuyo apellido empieza por 'A': "+ personas.stream().filter(person -> person.getFirstName().startsWith("A")).count());

        //Ejercicio 3:
        System.out.println("Nombres únicos en orden alfabético: ");
        personas.stream().map(s-> s.getFirstName()).distinct().sorted().forEach(s -> System.out.println(s));

        //Ejercicio 4:
        Scanner scan = new Scanner(System.in);
        List<String> registros = new ArrayList<>();

        String entrada;
        do{
            System.out.println("Introduce cadena: ");
            entrada = scan.nextLine();
            if(entrada != ""){
                registros.add(entrada);
            }
        }while (entrada != "");

        registros.stream().forEach(s -> System.out.println(s));

        //Ejercicio 5:
        List<Integer> numeros = new ArrayList<>();
        int numeroEntrada = 1;
        do{
            System.out.println("Introduce número (negativo para finalizar): ");
            numeroEntrada = scan.nextInt();
            if(numeroEntrada > 0){
                numeros.add(numeroEntrada);
            }
        }while (numeroEntrada > 0);

        System.out.println("Números que has introducido entre 1 y 5: ");
        numeros.stream().filter(s-> s < 5 && s> 1).forEach(s-> System.out.println(s));

        //Ejercicio 6
        List<Person> listaPersonas = new ArrayList<>();

        String dato;
        do{
            System.out.println("Introduce cadena: ");
            dato = scan.nextLine();
            listaPersonas.add()
        }while (dato != "");




    }

}
