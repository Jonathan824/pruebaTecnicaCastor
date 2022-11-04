/*
*********************************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo						*
*	Cuando realiza	:	26/10/2022								*						*
*	Para quién	:	Castor									*						*
*	Descripción	:	Se crea controlador para función de retorno de los métodos del CRUD     *
*********************************************************************************************************
*/
package com.codeteam.CrudCode.Controller;

import com.codeteam.CrudCode.Model.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeteam.CrudCode.Service.EmpleadoService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    //listar
    @GetMapping("/empleados")
    public List<Empleado> listar()
    {
        return empleadoService.findAll();
    }
    
    //guardar
    @PostMapping("/empleados")
    public  Empleado guardar(@RequestBody Empleado empleado)
    {
        return empleadoService.save(empleado);
    }
    
    //get una tarea
    @GetMapping("/empleados/{id}")
    public Empleado getUnaTarea(@PathVariable Integer id)
    {
        return empleadoService.findById(id);
    }
    
    //Modeficar
    @PutMapping("/empleados/{id}")
    public Empleado modificar(@RequestBody Empleado empleado, @PathVariable Integer id) {
        Empleado empleadoActual = empleadoService.findById(id);
        empleadoActual.setCedula(empleado.getCedula());
        empleadoActual.setNombre(empleado.getNombre());
        empleadoActual.setRuta(empleado.getRuta());
        empleadoActual.setFecha(empleado.getFecha());
        empleadoActual.setCargo(empleado.getCargo());

        return empleadoService.save(empleadoActual);
    }
    
    @DeleteMapping("/empleados/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        empleadoService.delete(id);
    }
    
}
