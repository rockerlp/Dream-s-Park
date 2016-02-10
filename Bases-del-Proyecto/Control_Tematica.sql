use ProyectoBD;

call Buscar_Tematica_Nombre("Las vegas");

delimiter |
create procedure insertar_Tematica(in nom varchar(20),in des varchar(100))
begin 
	insert into Tematica (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;



delimiter |
create view Mostrar_Tematica_Nombres as
	select nombre from Tematica;

|
delimiter ;

delimiter |
create view Mostrar_Tematica as
	select nombre,descripcion from Tematica;

|
delimiter ;

delimiter |
create procedure Buscar_Tematica_Nombre(in nom varchar(20))
begin 
	
	select idTematica from Tematica where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Editar_Tematica(in idTem int, in nom varchar(20),in des varchar(100))
begin 
	
	update Tematica set Nombre=nom,Descripcion=des where idTematica=idTem;
end
|
delimiter ;

delimiter |
create procedure Borrar_Tematica(in idTem int)
begin 
	
	delete from Tematica where idTematica=idTem;
	
end
|
delimiter ;