package isi.died.taller01;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private Integer id;
    private String nombre;
    private int nroLegajo;
    private List<Curso> cursos;
    
    public Alumno() {
    	this.cursos = new ArrayList<Curso>();
    }
    
    public Alumno(int id, String nombre, int nroLegajo) {
    	this();
    	this.id = id;
    	this.nombre = nombre;
    	this.nroLegajo = nroLegajo;
    }
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroLegajo() {
		return nroLegajo;
	}
	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void agregarCurso(Curso c) {
		this.cursos.add(c);
	}
    
    
}
