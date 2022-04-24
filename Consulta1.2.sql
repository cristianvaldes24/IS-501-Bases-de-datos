SELECT * FROM empleado;
SELECT * FROM asesor;
SELECT * FROM mecanico;
SHOW COLUMNS FROM asesor;
SELECT * FROM cliente;
SHOW COLUMNS FROM cliente;
SELECT * FROM citas;

INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1001, 'Bryan', 'Fernando', 'Cámbar', 'Donaire', 87546425);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1002, 'Cristian', 'Enrique', 'Valdes', 'Campos', 86654578);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1003, 'Eber', 'Josue', 'Dominguez', ' ',  93544525);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1004, 'Carlos', 'Alberto', 'Dominguez', 'Flores',  93548374);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1005, 'Carlos', 'Alberto', 'Garcia', 'Meza',  93544525);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1006, 'Dante', 'Vegeta', 'Hernandez', 'Ferrera',  93544525);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1007, 'Kevin', 'Antonio', 'Romero', 'Vasquez',  93544525);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1008, 'Marvin', 'Antonio', 'Cacho', 'Arzu',  93544525);
INSERT INTO empleado (id_empleado, nombre, segundo_nombre, primer_apellido, segundo_apellido, numero_telefono) 
VALUES (1009, 'Jazmin', 'Alejandra', 'Dominguez', 'Villanueva ',  93544525);

ALTER TABLE 

UPDATE empleado SET tipoEmpleado = 'asesor' WHERE id_empleado = 1001;
UPDATE empleado SET tipoEmpleado = 'asesor' WHERE id_empleado = 1002;
UPDATE empleado SET tipoEmpleado = 'asesor' WHERE id_empleado = 1003;
UPDATE empleado SET tipoEmpleado = 'mecanico' WHERE id_empleado = 1004;
UPDATE empleado SET tipoEmpleado = 'mecanico' WHERE id_empleado = 1005;
UPDATE empleado SET tipoEmpleado = 'mecanico' WHERE id_empleado = 1006;
UPDATE empleado SET tipoEmpleado = 'mecanico' WHERE id_empleado = 1007;
UPDATE empleado SET tipoEmpleado = 'mecanico' WHERE id_empleado = 1008;
UPDATE empleado SET tipoEmpleado = 'asesor' WHERE id_empleado = 1009;

INSERT INTO asesor ()

/*
ALTER TABLE empleado ADD COLUMN tipoEmpleado VARCHAR(30) NOT NULL AFTER id_empleado;

ALTER TABLE empleado ADD CONSTRAINT fk_tipoEmpleado foreign KEY (tipoEmpleado)
REFERENCES
*/ 
ALTER TABLE cliente ADD COLUMN cita integer NOT NULL AFTER numero_telefono;
ALTER TABLE cliente ADD CONSTRAINT fk_cita FOREIGN KEY (cita)
references citas (id_cita) ON DELETE CASCADE ON UPDATE CASCADE;