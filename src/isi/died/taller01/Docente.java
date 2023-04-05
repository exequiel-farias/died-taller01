package isi.died.taller01;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    private Integer id;
    private String nombre;
    private Double salario;
    private List<Curso> cursosDictados = new ArrayList<Curso>();
    
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public List<Curso> getCursosDictados() {
		return cursosDictados;
	}
	public void setCursosDictados(List<Curso> cursosDictados) {
		this.cursosDictados = cursosDictados;
	} 
	
	public int cantCursosObligatorio() {
		int cant = 0;
		for(Curso unCurso : cursosDictados) {
			if(unCurso.tipoCurso().equals("obligatorio")) cant++;
		}
		return cant;
	}
	
	public int cantCursosOptativo() {
		int cant = 0;
		for(Curso unCurso : cursosDictados) {
			if(unCurso.tipoCurso().equals("optativo")) cant++;
		}
		return cant;
	}
	
	public void agregarCurso(Curso curso) {
		cursosDictados.add(curso);
	}
}
