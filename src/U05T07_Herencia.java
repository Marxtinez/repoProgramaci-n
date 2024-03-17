public class U05T07_Herencia {
    /**
     * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
     */
    /**
     * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
     */
    public abstract class Animal {
        private String nombre;

        /**
         * Constructor para objetos de la clase Animal
         */
        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * El método comunicarse es común para el gato y el perro, aunque cada uno lo hace de una forma
         */
        public void comunicarse() {
            System.out.println("Mi nombre es " + nombre);
        }

        /**
         * El método respirar es común para el gato y el perro
         */
        public abstract void respirar();

        /**
         * El método moverse es común para el gato y el perro
         */
        public abstract void  moverse();


        /**
         * toString() Representación como cadena de un objeto animal
         *
         * @returns La representación como cadena de un objeto animal
         */
        public String toString() {
            return "Animal: " + nombre;
        }
    }
    public abstract class Mamifero extends Animal{
        public Mamifero(String nombre){
            super(nombre);
        }
        public void mamar(){
            System.out.println("Cuando soy pequenio mamo");
        }

        public void respirar() {
            System.out.println("Respiro por los pulmones");
        }

        public void moverse() {
            System.out.println("Me muevo a cuatro potes");
        }
    }
    public class Perro extends Mamifero{
        public Perro(String nombre){
                super(nombre);
        }
        public void comunicarse(){
                System.out.println("Guau");
        }
        public void traerZapatillas(){
                System.out.println("Toma tus zapatillas, humano");
            }
        }

        public class Gato extends Mamifero implements Jugar{
            public Gato(String nombre){
                super(nombre);
            }

            public void comunicarse() {
                System.out.println("Miau");
                super.comunicarse();
            }
            public void jugarConOvillos(){
                System.out.println("Me gsuta jugar con ovillos");
            }

            @Override
            public void saltarPorUnAro() {
                System.out.println("Sé jugar a saltar por el aro.");
            }

            @Override
            public void perseguirUnObjeto(String objeto) {
                System.out.println("Sé jugar a perseguir un "+ objeto);
            }
        }
        public abstract class Pez extends Animal{

            /**
             * Constructor para objetos de la clase Animal
             *
             * @param nombre
             */
            public Pez(String nombre) {
                super(nombre);
            }
            public void respirar() {
                System.out.println("Respiro por branquias");
            }

            public void moverse() {
                System.out.println("Nado con aletas");
            }

        }
        public class Tiburon extends Pez implements Jugar {
            /**
             * Constructor para objetos de la clase Animal
             *
             * @param nombre
             */
            public Tiburon(String nombre) {
                super(nombre);
            }

            public void comunicarse() {
                System.out.println("Arqueo el cuerpo para comunicarme");
            }

            @Override
            public void saltarPorUnAro() {
                System.out.println("Se jugar a saltar por el aro");
            }

            @Override
            public void perseguirUnObjeto(String objeto) {
                System.out.println("Sé jugar a perseguir un "+ objeto);
            }
        }
    public class PezPayaso extends Pez {
        /**
         * Constructor para objetos de la clase Animal
         *
         * @param nombre
         */
        public PezPayaso(String nombre) {
            super(nombre);
        }

        public void comunicarse() {
            System.out.println("Me comunico mediante burbujas");
        }
    }
    public interface Jugar{
        void saltarPorUnAro();
        void perseguirUnObjeto(String objeto);
    }
    public class Entrenador extends Mamifero {
        public Entrenador(String nombre) {
            super(nombre);
        }
        public void entrenar(Jugar animalQueSabeJugar){
            animalQueSabeJugar.saltarPorUnAro();
        }
        public void dejarEntrar(Animal animal){
            if(animal instanceof Jugar){
                System.out.println("Pasa que te entreno");
            }else{
                System.out.println("Lo siento, no sabes jugar");
            }
        }
    }


}
