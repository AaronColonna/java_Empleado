package com.aaroncolonna.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aaroncolonna.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer>{

}
