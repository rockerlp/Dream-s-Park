use ProyectoBD;


delimiter |
create procedure insertar_Estado_Reservacion(in nom varchar(45),in des varchar(100))
begin 
	insert into Estado_Reservacion (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;

delimiter |
create view Mostrar_Estado_Reservacion as
	select Nombre,Descripcion from Estado_Reservacion;

|
delimiter ;

delimiter |
create view Mostrar_Estado_Reservacion_Nombre as
	select Nombre,Descripcion from Estado_Reservacion;

|
delimiter ;

delimiter |
create procedure Buscar_Estado_Reservacion_Nombre(in nom varchar(45))
begin 
	select idEstado_Reservacion from Estado_Reservacion where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Editar_Estado_Reservacion(in idEst int, in nom varchar(20),in des varchar(100))
begin 
	
	update Estado_Estado_Reservacion set Nombre=nom,Descripcion=des where idEstado_Reservacion=idEst;
end
|
delimiter ;

delimiter |
create procedure Borrar_Estado_Reservacion (in idEst int)
begin 
	
	delete from Estado_Reservacion where idEstado_Reservacion=idEst;
	
end
|
delimiter ;

call insertar_Estado_Reservacion("Activado","");
call insertar_Estado_Reservacion("Completado","");
call insertar_Estado_Reservacion("Cancelado","");