use ProyectoBD;


delimiter |
create procedure insertar_Tipo_Evento(in nom varchar(20),in des varchar(100))
begin 
	insert into Tipo_Evento (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;

delimiter |
create view Mostrar_Tipo_Evento as
	select nombre,descripcion from Tipo_Evento;

|
delimiter ;

delimiter |
create procedure Buscar_Tipo_Nombre(in nom varchar(20))
begin 
	
	select idTipo_Evento from Tipo_Evento where Nombre=nom;
end
|
delimiter ;

delimiter |
create view Mostrar_Tipo_Evento_nombre as
	select nombre from Tipo_Evento;

|
delimiter ;

delimiter |
create procedure Editar_Tipo_Evento(in idTip int, in nom varchar(20),in des varchar(100))
begin 
	
	update Tipo_Evento set Nombre=nom,Descripcion=des where idTipo_Evento=idTip;
end
|
delimiter ;

delimiter |
create procedure Borrar_Tipo_Evento(in idTip int)
begin 
	
	delete from Tipo_Evento where idTipo_Evento=idTip;
	
end
|
delimiter ;