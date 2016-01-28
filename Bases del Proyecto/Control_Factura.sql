use ProyectoBD;


delimiter |
create procedure insertar_Factura(in fech date, in des varchar(45),in sub double, in ivC double, in ivD double, in tot double,in idEv int)
begin 
	set foreign_key_checks=0;
	insert into Factura (fecha,descripcion,subtotal,ivaCero,ivaDoce,total,Eventos_idEventos)values( fech ,  des , sub ,  ivC ,  ivD ,  tot , idEv );
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Factura as
	select * from Factura;

|
delimiter ;

delimiter |
create procedure Editar_Factura(in idF int,in fech date, in des varchar(45),in sub double, in ivC double, in ivD double, in tot double,in idEv int)
begin 
	
	update Factura set fecha=fech,descripcion=des,subtotal=sub,ivaCero=ivC,ivaDoce=ivD,total=tot,Eventos_idEventos=idEv where idFactura=idF;
end
|
delimiter ;

delimiter |
create procedure Borrar_Factura(in idF int)
begin 
	
	delete from Factura where idFactura=idF;
	
end
|
delimiter ;