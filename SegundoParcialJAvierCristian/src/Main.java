public class Main {

    public static void main(String[] args) {


        Profesor profesor = new Profesor(100,"Jhon","Doe");
        System.out.println(profesor);

        Estudiante estudiante = new Estudiante(34851236,"Cristian","Javier","Analista de sistemas");
        System.out.println(estudiante);

        estudiante.getMateriasAprobadas().add("Base de datos");
        estudiante.getMateriasAprobadas().add("Experiencia del Usuario");
        estudiante.getMateriasAprobadas().add("Web 1");

        estudiante.getMateriasInscriptas().add("POO");
        estudiante.getMateriasInscriptas().add("PHP");

        estudiante.imprimirMateriasAprobadas();
        estudiante.imprimirMateriasInscriptas();
    }

}
