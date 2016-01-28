use ProyectoBD;


delimiter |
create procedure insertar_Inventario(in nom varchar(20),in cant int, in prC double, in pcV double,in idTip int)
begin 
	set foreign_key_checks=0;
	insert into Inventario (nombre,cantidad,precioCompra,precioVenta,Tipo_Inventario_id)values(nom , cant ,prC ,  pcV , idTip );
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Inventario as
	select * from Inventario;

|
delimiter ;

delimiter |
create procedure Editar_Inventario(in idInv int,in nom varchar(20),in cant int, in prC double, in pcV double,in idTip int)
begin 
	set foreign_key_checks=0;
	update Inventario set nombre=nom,cantidad=cant,precioCompra=prC,precioVenta=pcV,Tipo_Inventario_id=idTip where Tipo_Inventario_ido=idInv;
	set foreign_key_checks=1;
end
|
delimiter ;

delimiter |
create procedure Borrar_Inventario(in idTip int)
begin 
	
	delete from Tipo_Inventario where Tipo_Inventario_ido=idTip;
	
end
|
delimiter ;