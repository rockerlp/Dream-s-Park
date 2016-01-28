use ProyectoBD;


delimiter |
create procedure insertar_detalle_Evento(in idEx int ,in idInv int , in idEv int)
begin 
	set foreign_key_checks=0;
	insert into detalleEvento (Extras_idExtras,Inventario_idInventario,Eventos_idEventos)values(idEx,idInv,idEv);
	set foreign_key_checks=1;
	
end
|
delimiter ;



delimiter |
create view Mostrar_detalle_evento as
	select * from detalleEvento;
|
delimiter ;



delimiter |
create procedure Editar_detalle_evento(in idE int,in idInv int , in idEv int)
begin 
	set foreign_key_checks=0;
	update detalleEvento set Extras_idExtras=idE,Inventario_idInventario=idInv where Eventos_idEventos=idEv;
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create procedure Borrar_detalle_evento(in idE int,in idInv int , in idEv int)
begin 
	delete from detalleEvento where Extras_idExtras=idE AND Inventario_idInventario=idInv AND Eventos_idEventos=idEv;
end
|
delimiter ;