use ProyectoBD;


delimiter |
create procedure insertar_Evento(in fech date,
in sal varchar(15),in np int, in des varchar(100),
in cost double,in idTem int,in idTip int,in idEst int)
begin 
	set foreign_key_checks=0;
	
	insert into Eventos (idEVentos,fecha,salon,numPersonas,descripcion,costo,Tematica_idTematica,Tipo_Evento_idTipo,Estado_Evento_idEstado_Evento)values(idEv,fech,sal,np,des,cost,idTem,idTip,idEst);
	set foreign_key_checks=1;
	
end
|
delimiter ;


delimiter |
create procedure Buscar_Evento(in fech date,in des varchar(100),in sal varchar(15),in np int,in cost double)
begin 
	select e.idEventos from Eventos e where e.fecha=fech and e.descripcion=des and e.salon=sal and e.numPersonas=np and e.costo=cost;
	
end
|
delimiter ;

delimiter |
create view Mostrar_Evento as
	select *from Eventos;
|
delimiter ;

delimiter |
create view Mostrar_Evento_Cliente_EstadoAct  as
	select e.fecha,p.nombres,p.apellidos,e.descripcion,e.costo,
	e.numPersonas,e.salon,t.Nombre as tematica,te.Nombre as tipo
	from Tematica t,Tipo_Evento te,Eventos e,Reservacion r,Cliente c,Estado_Evento ee,Persona p
	where p.idPersona=c.Persona_idPersona 
	and e.idEventos=r.idReservacion and r.Cliente_idCliente=c.idCliente
	and e.Tematica_idTematica=t.idTematica
	and e.Tipo_Evento_idTipo_Evento=te.idTipo_Evento
    and e.Estado_Evento_idEstado_Evento=ee.idEstado_Evento
	and ee.Nombre="Activo";

|
delimiter ;

delimiter |
create view Mostrar_Evento_Cliente_EstadoComp  as
	select e.fecha,p.nombres,p.apellidos,e.descripcion,e.costo,
	e.numPersonas,e.salon,t.Nombre as tematica,te.Nombre as tipo
	from Tematica t,Tipo_Evento te,Eventos e,Reservacion r,Cliente c,Estado_Evento ee,Persona p
	where p.idPersona=c.Persona_idPersona 
	and e.idEventos=r.idReservacion and r.Cliente_idCliente=c.idCliente
	and e.Tematica_idTematica=t.idTematica
	and e.Tipo_Evento_idTipo_Evento=te.idTipo_Evento
    and e.Estado_Evento_idEstado_Evento=ee.idEstado_Evento
	and ee.Nombre="Completado";

|
delimiter ;

delimiter |
create view Mostrar_Evento_Cliente_EstadoCan  as
	select e.fecha,p.nombres,p.apellidos,e.descripcion,e.costo,
	e.numPersonas,e.salon,t.Nombre as tematica,te.Nombre as tipo
	from Tematica t,Tipo_Evento te,Eventos e,Reservacion r,Cliente c,Estado_Evento ee,Persona p
	where p.idPersona=c.Persona_idPersona 
	and e.idEventos=r.idReservacion and r.Cliente_idCliente=c.idCliente
	and e.Tematica_idTematica=t.idTematica
	and e.Tipo_Evento_idTipo_Evento=te.idTipo_Evento
    and e.Estado_Evento_idEstado_Evento=ee.idEstado_Evento
	and ee.Nombre="Cancelado";

|
delimiter ;

delimiter |
create procedure Editar_Eventos(in idEv int,
	in fech date,in sal varchar(15),in np int, 
	in des varchar(100),in cost double,in idTem int,
	in idTip int,in idEst int)
begin 
	set foreign_key_checks=0;
	update Eventos set fecha=fech,salon=sal,numPersonas=np,descripcion=des,costo=cost,Tematica_idTematica=idTem,Tipo_Evento_idTipo_Evento=idTip,Estado_Evento_idEstado_Evento=idEst where idEventos=idEv;
	set foreign_key_checks=1;
end
|
delimiter ;

delimiter |
create procedure Borrar_Eventos(in idEv int)
begin 

	delete from Eventos where idEventos=idEv;
end
|
delimiter ;