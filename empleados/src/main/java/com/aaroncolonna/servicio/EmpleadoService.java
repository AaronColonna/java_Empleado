package com.aaroncolonna.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaroncolonna.interfaceServicio.IempleadoService;
import com.aaroncolonna.interfaz.IEmpleado;
import com.aaroncolonna.modelo.Empleado;

@Service
public class EmpleadoService implements IempleadoService{
	
	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado empleado=data.save(e);
		if(!empleado.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
