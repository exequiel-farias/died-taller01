package isi.died.taller01;

import java.util.ArrayList;
import java.util.List;

import isi.died.taller01.excepciones.LimiteDocenteCursoException;

public abstract class Curso {

	 private int id;
	 private String nombre;
	 private int creditos;
	 private Docente docente;
	 protected List<Alumno> alumnos;
	 protected final int CANTIDAD_MAXIMA_DOCENTES = 3;
	 
	 public Curso() {
		 this.alumnos = new ArrayList<Alumno>();
	 }
	 
	 public Curso(int id, String nombre, int creditos) {
		 this();
		 this.id = id;
		 this.nombre = nombre;
		 this.creditos = creditos;
	 }

	 public abstract String tipoCurso();
	 
	 public abstract void inscribir(Alumno a) throws Exception;

	 public abstract void asignar(Docente d) throws LimiteDocenteCursoException;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Docente getDocente() {
		return docente;
	}
	
	protected void setDocente(Docente docente) {
		this.docente = docente;
	}

	public final void asignarDocente(Docente docente) {
		if(docente.getCursosDictados().size() < CANTIDAD_MAXIMA_DOCENTES) this.docente = docente;
	}
}
