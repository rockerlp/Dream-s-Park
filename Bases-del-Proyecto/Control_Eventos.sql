use ProyectoBD;


delimiter |
create procedure insertar_Evento(in fech date,in sal varchar(15),in np int, in des varchar(100),in cost double,in idTem int,in idTip int)
begin 
	set foreign_key_checks=0;
	
	insert into Eventos (idEVentos,fecha,salon,numPersonas,descripcion,costo,Tematica_idTematica,Tipo_Evento_idTipo)values(idEv,fech,sal,np,des,cost,idTem,idTip);
	set foreign_key_checks=1;
	
end
|
delimiter ;

delimiter |
create view Mostrar_Evento as
select *from Eventos e;
|
delimiter ;

delimiter |
create procedure Editar_Eventos(in idEv int,in fech date,in sal varchar(15),in np int, in des varchar(100),in cost double,in idTem int,in idTip int)
begin 
	set foreign_key_checks=0;
	update Eventos set fecha=fech,salon=sal,numPersonas=np,descripcion=des,costo=cost,Tematica_idTematica=idTem,Tipo_Evento_idTipo_Evento=idTip where idEventos=idEv;
	set foreign_key_checks=1;
end
|
delimiter ;
drop procedure Editar_Eventos;


delimiter |
create procedure Borrar_Eventos(in idEv int)
begin 

	delete from Eventos where idEventos=idEv;
end
|
delimiter ;