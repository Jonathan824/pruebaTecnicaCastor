INSERT INTO tipoServicio(NroServicio,NombreServicio		)
VALUES					(1, 'Servicio de limpieza'		),
						(2, 'Servicio de abogados'		),
						(7, 'Servicio de informaci�n'	),
						(4, 'Servicio de liquidaci�n'	)

INSERT INTO personasHabilesParaSolicitarServicios(cedula,Nombres,Apellidos,NombreIntegrado)
VALUES											 (1001577726,'Jonathan', 'Murillo Jaramillo', 'Jonathan Murillo Jaramillo'	),
												 (1001577736,'Juan Andr�s', 'Zapata Ortiz'	, 'Juan Andr�s Zapata Ortiz'	),
												 (1001577756,'Andrea', 'Henao Polo'	, 'Andrea Henao Polo'					)


INSERT INTO solicitudesDeServicios(NroSolicitud,FechaSolicitud, IdentificaSolicitante, EstadoSolicitud, TipoServicio)
VALUES							  (101,'20221103',2,'A',7),
								  (122,'20221101',1,'I',2),
								  (1,'20220910',1,'I',4  )

SELECT * FROM tipoServicio
SELECT * FROM solicitudesDeServicios
SELECT * FROM personasHabilesParaSolicitarServicios