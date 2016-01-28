use ProyectoBD;


delimiter |
create procedure insertar_Tipo_Inventario(in nom varchar(20),in des varchar(100))
begin 
	insert into Tipo_Inventario (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;



delimiter |
create view Mostrar_Tipo_Inventario as
	select * from Tipo_Inventario;

|
delimiter ;

delimiter |
create procedure Editar_Tipo_Inventario(in idTip int,in nom varchar(20),in des varchar(100))
begin 
	
	update Tipo_Inventario set Nombre=nom,Descripcion=des where idTipo_Inventario=idTem;
end
|
delimiter ;

delimiter |
create procedure Borrar_Tipo_Inventario(in idTip int)
begin 
	
	delete from Tipo_Inventario where idTipo_Inventario=idTem;
	
end
|
delimiter ;