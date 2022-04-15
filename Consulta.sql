CREATE TABLE cliente(
id_cliente integer PRIMARY KEY AUTO_INCREMENT NOT NULL, 
nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
numero_telefono INTEGER,
direccion VARCHAR(50),
e_mail VARCHAR(50)
);

CREATE TABLE automovil(
id_placa VARCHAR(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
marca VARCHAR(10),
modelo VARCHAR(10),
numero_motor VARCHAR(10),
fecha DATETIME
);

CREATE TABLE empleado(
id_empleado INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
nombre VARCHAR(20),
segundo_nombre VARCHAR(20),
primer_apellido VARCHAR(20),
segundo_apellido VARCHAR(20),
numero_telefono INTEGER
);

CREATE TABLE mecanico(
id_mecanico INTEGER  NOT NULL,
cita_asignada VARCHAR(20),
FOREIGN KEY (id_mecanico) REFERENCES empleado(id_empleado)
);

CREATE TABLE asesor(
id_asesor INTEGER NOT NULL,
grupo_mecanico VARCHAR(20),
FOREIGN KEY (id_asesor) REFERENCES empleado(id_empleado)
);

CREATE TABLE citas(
id_cita INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
fecha_hora_entrada DATETIME,
tipo_matenimiento VARCHAR(50),
reparacion VARCHAR(50),
telefono INTEGER,
fecha_hora_salida datetime
);

