use ProyectoBD;


delimiter |
create procedure insertar_detalle(in idEx int, in idInv int, in idEv int, in cant int)
begin 
	set foreign_key_checks=0;
	insert into detalleEvento (Extras_idExtras,Inventario_idInventario,Eventos_idEventos,Cantidad)values(idEx,idInv,idEv,cant);
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_detaller as
	select * from detalleEvento;

|
delimiter ;


delimiter |
create procedure Editar_detalle(in idEx int, in idInv int, in idEv int, in cant int)
begin 
	set foreign_key_checks=0;
	update detalleEvento set Cantidad=cant,Extras_idExtras=idEx,Inventario_IdInventario=idInv where Eventos_idEventos=idEv;
	set foreign_key_checks=1;
end
|
delimiter ;


delimiter |
create procedure Borrar_detalle(in idEx int, in idInv int, in idEv int)
begin 
	delete from detalleEvento where Extras_idExtras=idEx and Inventario_idInventario=idInv and Eventos_idEventos=idEv;
end
|
delimiter ;