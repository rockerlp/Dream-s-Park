use ProyectoBD;


delimiter |
create procedure insertar_Empleado(in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35),in idC int,in idH int)
begin 
	set foreign_key_checks=0;
	call insertar_persona(CR,nom,ape,fnac,dir);
	insert into Empleado (Persona_idPersona,Cargo_idCargo,Horario_idHorario)values(LAST_INSERT_ID(),idC,idH);
	set foreign_key_checks=1;
	
end
|
delimiter ;

delimiter |
create view Mostrar_Empleado as
	select p.CI_RUC,p.nombres,p.apellidos,p.fechaNacimiento,p.direccion,e.Cargo_idCargo,e.Horario_idHorario from Persona p join Empleado e on p.idPersona=e.Persona_idPersona;

|
delimiter ;

delimiter |
create procedure Editar_Empleado(in idPers int,in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35),in idEmp int,in idC int,in idH int)
begin 
	set foreign_key_checks=0;
	call Editar_persona(idPers,CR,nom,ape,fnac,dir);
	update Empleado set Cargo_idCargo=idC,Horario_idHorario=idH where idEmpleado=idEmp;
	set foreign_key_checks=1;
end
|
delimiter ;


delimiter |
create procedure Borrar_Empleado(in idEmp int)
begin 

	call Borrar_persona((select p.idPersona from Persona p join Empleado e on p.idPersona=e.Persona_idPersona where e.idEmpleado=idEmp));
	delete from Empleado where idEmpleado=idEmp;
end
|
delimiter ;