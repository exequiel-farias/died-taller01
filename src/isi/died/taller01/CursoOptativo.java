package isi.died.taller01;

import isi.died.taller01.excepciones.LimiteAlumnoCursoException;
import isi.died.taller01.excepciones.LimiteDocenteCursoException;

public class CursoOptativo extends Curso {
	private int cupo;
	
	public CursoOptativo(int cupo,int id, String nombre, int creditos) {
		super(id,nombre,creditos);
		this.cupo = cupo;
	}
	
	@Override
	public String tipoCurso() {
		return "optativo";
	}

	@Override
	public void inscribir(Alumno a) throws LimiteAlumnoCursoException {
		if(alumnos.size() < cupo) alumnos.add(a);
		else throw new LimiteAlumnoCursoException("El curso no tiene cupo para el alumno "+a.getNombre());
	}

	@Override
	public void asignar(Docente d) throws LimiteDocenteCursoException {
		if(d.getCursosDictados().size() < CANTIDAD_MAXIMA_DOCENTES) {
			this.setDocente(d);
			d.agregarCurso(this);
		}
		else throw new LimiteDocenteCursoException("El docente ya está asignado a tres cursos");
	}

}
