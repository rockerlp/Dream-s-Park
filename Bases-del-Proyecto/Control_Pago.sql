use ProyectoBD;


delimiter |
create procedure insertar_Pago(in fech date, in des varchar(45),in imp double,in ivC double, in ivD double,idC int,in idInv int)
begin 
	set foreign_key_checks=0;
	insert into Pago (fecha,descripcion,importe,ivaCero,ivaDoce,Compras_idCompras,Inventario_idInventario)values( fech ,  des , imp ,  ivC ,  ivD , idC,idInv);
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Pago as
	select * from Pago;

|
delimiter ;

delimiter |
create procedure Editar_Pago(in idP int,in fech date, in des varchar(45),in imp double,in ivC double, in ivD double,idC int,in idInv int)
begin 
	set foreign_key_checks=0;
	update Factura set fecha=fech,descripcion=des,importe=imp,ivaCero=ivC,ivaDoce=ivD,Compras_idCompras=ivC,Inventario_IdInventario=idInv where idPago=idP;
	set foreign_key_checks=0;
end
|
delimiter ;

delimiter |
create procedure Borrar_Pago(in idP int)
begin 
	
	delete from Pago where idPago=idP;
	
end
|
delimiter ;