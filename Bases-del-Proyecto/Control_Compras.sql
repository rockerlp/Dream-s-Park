use ProyectoBD;


delimiter |
create procedure insertar_Compras(in fech date, in des varchar(45),in cant int,in prec double, in idP int, in idE int)
begin 
	set foreign_key_checks=0;
	insert into Compras (fecha,descripcion,cantidad,precio,Proveedor_idProveedor,Empleado_idEmpleado)values( fech ,  des , cant,prec,idP.idE);
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Compras as
	select * from Compras;

|
delimiter ;

delimiter |
create procedure Editar_Compras(in idC int,in fech date, in des varchar(45),in cant int,in prec double, in idP int, in idE int)
begin 
	set foreign_key_checks=0;
	update Compras set fecha=fech,descripcion=des,cantidad=cant,precio=prec,Proveedor_idProveedor=idP,Empleado_idEmpleado=idE where idCompras=idC;
	set foreign_key_checks=0;
end
|
delimiter ;

delimiter |
create procedure Borrar_Compras(in idC int)
begin 
	
	delete from Compras where idCompras=idC;
	
end
|
delimiter ;