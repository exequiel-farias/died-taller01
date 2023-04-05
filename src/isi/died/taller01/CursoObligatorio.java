package isi.died.taller01;

import isi.died.taller01.excepciones.CreditosInsuficienteAlumnoException;
import isi.died.taller01.excepciones.LimiteDocenteCursoException;

public class CursoObligatorio extends Curso {

	public CursoObligatorio(int id,String nombre,int creditos) {
		super(id,nombre,creditos);
	}
	
	@Override
	public String tipoCurso() {
		return "obligatorio";
	}

	@Override
	public void inscribir(Alumno a) throws CreditosInsuficienteAlumnoException {
		int creditosRequeridos = 0;
		for(Curso unCurso : a.getCursos()) {
			creditosRequeridos += unCurso.getCreditos();
		}
		if(creditosRequeridos >= this.getCreditos()) alumnos.add(a);
		else throw new CreditosInsuficienteAlumnoException("El alumno no tiene los creditos necesarios");
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
