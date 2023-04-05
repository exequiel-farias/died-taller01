package isi.died.taller01.app;

import java.util.ArrayList;
import java.util.List;

import isi.died.taller01.Alumno;
import isi.died.taller01.Curso;
import isi.died.taller01.CursoObligatorio;
import isi.died.taller01.CursoOptativo;
import isi.died.taller01.Docente;
import isi.died.taller01.excepciones.LimiteDocenteCursoException;

public class App {

	public static void main(String[] args) {
		PruebaA();
		System.out.println("Prueba A Finalizada");
		PruebaB();
		System.out.println("Prueba B Finalizada");
		PruebaC();
		System.out.println("Prueba C Finalizada");
		PruebaD();
		System.out.println("Prueba D Finalizada");
		PruebaE();
		System.out.println("Prueba E Finalizada");
		try {
			PruebaF();
		} catch (LimiteDocenteCursoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Prueba F Finalizada");
		
	}
	
	/**
	 * a.	Crear un alumno, un curso obligatorio e 
	 * inscribir a dicho alumno al curso obligatorio 
	 * (puede crear todos los objetos auxiliares que necesite) 
	 * de manera exitosa.
	 */
	private static void PruebaA() {
		Alumno a = new Alumno(1,"Juan",1111);
		Curso c = new CursoObligatorio(1,"AMI",0);
		try {
			c.inscribir(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * b.	Crear un alumno, un curso optativo e inscribir 
	 * a dicho alumno al curso optativo (puede crear todos 
	 * los objetos auxiliares que necesite).
	 */
	private static void PruebaB() {
		Alumno a = new Alumno(1,"Juan",1111);
		Curso c = new CursoOptativo(10,2,"DIED",3);
		try {
			c.inscribir(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * c.	Crear un alumno que no cumple los requisitos 
	 * para anotarse a un curso obligatorio, intentar 
	 * inscribir a dicho alumno al curso obligatorio (puede 
	 * crear todos los objetos auxiliares que necesite).
	 */
	private static void PruebaC() {
		Alumno a = new Alumno(1,"Juan",1111);
		Curso c = new CursoObligatorio(2,"AMII",2);
		try {
			c.inscribir(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * d.	Crear un alumno que no cumple los requisitos 
	 * para anotarse a un curso opcional, intentar inscribir 
	 * a dicho alumno al curso opcional (puede crear todos 
	 * los objetos auxiliares que necesite).
	 */
	private static void PruebaD() {
		Alumno a1 = new Alumno(1,"Juan",1111);
		Alumno a2 = new Alumno(2,"Pedro",2222);
		Alumno a3 = new Alumno(3,"Agu",3333);
		Curso c = new CursoOptativo(2,2,"DIED",3);
		try {
			c.inscribir(a1);
			c.inscribir(a2);
			c.inscribir(a3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * e.	Crear un docente y asignar a un curso exitosamente
	 */
	private static void PruebaE() {
		Docente docente = new Docente();
		Curso c = new CursoOptativo(2,2,"DIED",3);
		docente.agregarCurso(c);
		c.asignarDocente(docente);
	}
	
	/**
	 * f.	Crear un docente que ya este asignado a 3 cursos 
	 * y asignarlo a un cuarto curso para lanzar una excepci�n 
	 * y capturarla en el m�todo main. 
	 * @throws LimiteDocenteCursoException 
	 */
	private static void PruebaF() throws LimiteDocenteCursoException {
		Docente docente = new Docente();
		Curso c1 = new CursoOptativo(2,2,"DIED",3);
		Curso c2 = new CursoObligatorio(3,"Algebra",1);
		Curso c3 = new CursoOptativo(4,4,"Finanzas",3);
		Curso c4 = new CursoObligatorio(5,"Fisica",1);
		
		c1.asignar(docente);
		c2.asignar(docente);
		c3.asignar(docente);
		c4.asignar(docente);
	}

}
