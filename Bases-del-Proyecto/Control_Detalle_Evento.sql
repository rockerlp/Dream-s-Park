use ProyectoBD;


delimiter |
create procedure insertar_proveedor(in nom varchar(25), in dir varchar(35), in telf varchar(10))
begin 
	insert into Proveedor (nombre,direccion,telefono)values(nom,dir,telf);
end
|
delimiter ;



delimiter |
create view Mostrar_Proveedor as
	select * from Proveedor;

|
delimiter ;

delimiter |
create procedure Editar_proveedor(in idProv int, in nom varchar(25), in dir varchar(35), in telf varchar(10))
begin 
	update Proveedor set Nombre=nom, direccion=dir,telefono=telf where idProveedor=idProv;
end
|
delimiter ;


delimiter |
create procedure Borrar_proveedor(in idProv int)
begin 
	delete from Proveedor where idProveedor=idProv;
end
|
delimiter ;