use ProyectoBD;


delimiter |
create procedure insertar_Estado_Evento(in nom varchar(45),in des varchar(100))
begin 
	insert into Estado_Evento (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;

delimiter |
create view Mostrar_Estado_Evento as
	select Nombre,Descripcion from Estado_Evento;

|
delimiter ;

delimiter |
create view Mostrar_Estado_Evento_Nombre as
	select Nombre from Estado_Evento;

|
delimiter ;

delimiter |
create procedure Buscar_Estado_Evento_Nombre(in nom varchar(45))
begin 
	select idEstado_Evento from Estado_Evento where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Editar_Estado_Evento(in idEst int, in nom varchar(20),in des varchar(100))
begin 
	
	update Estado_Evento set Nombre=nom,Descripcion=des where idEstado_Evento=idEst;
end
|
delimiter ;

delimiter |
create procedure Borrar_Estado_Evento (in idEst int)
begin 
	
	delete from Estado_Evento where idEstado_Evento=idEst;
	
end
|
delimiter ;
call insertar_Estado_Evento("Activado","");
call insertar_Estado_Evento("Completado","");
call insertar_Estado_Evento("Cancelado","");