package org.danixy8.springcloud.msvc.cursos.repositories;

import org.danixy8.springcloud.msvc.cursos.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
