use ProyectoBD;


delimiter |
create procedure insertar_Reservacion(in fech date, in des varchar(45),in cant int, in prec double, in idEv int,in idC int,in idEst int)
begin 
	set foreign_key_checks=0;
	insert into Reservacion (fecha,descripcion,cantidad,precio,Eventos_idEventos,Cliente_idCliente,Estado_Reservacion_idEstado_Reservacion)values( fech ,  des , cant,  prec ,  idEv,idC,idEst );
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Reservacion  as
	select * from Reservacion ;

|
delimiter ;

delimiter |
create procedure Editar_Reservacion (in idR int,in fech date, in des varchar(45),in cant int, in prec double, in idEv int,in idC int,in idEst int)
begin 
	set foreign_key_checks=0;
	update Reservacion  set fecha=fech,descripcion=des,cantidad=cant,precio=prec,Eventos_idEventos=idEv,Cliente_idCliente=idC,Estado_Reservacion_idEstado_Reservacion=idEst where idReservacion=idR;
	set foreign_key_checks=0;
end
|
delimiter ;

delimiter |
create procedure Borrar_Reservacion (in idR int)
begin 
	
	delete from Reservacion  where idReservacion=idR;
	
end
|
delimiter ;