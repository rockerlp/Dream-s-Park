use ProyectoBD;


delimiter |
create procedure insertar_Cargo(in nom varchar(20),in des varchar(100))
begin 
	insert into Cargo (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;

delimiter |
create view Mostrar_Cargo as
	select * from Cargo;

|
delimiter ;

delimiter |
create procedure Editar_Cargo(in idC int, in nom varchar(20),in des varchar(100))
begin 
	
	update Cargo set Nombre=nom,Descripcion=des where idCargo=idC;
end
|
delimiter ;

delimiter |
create procedure Borrar_Cargo(in idC int)
begin 
	
	delete from Cargo where idCargo=idC;
	
end
|
delimiter ;