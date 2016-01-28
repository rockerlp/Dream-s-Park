use ProyectoBD;


delimiter |
create procedure insertar_Tematica(in nom varchar(20),in des varchar(100))
begin 
	insert into Tematica (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;



delimiter |
create view Mostrar_Tematica as
	select * from Tematica;

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