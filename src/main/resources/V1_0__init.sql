CREATE TABLE productos(
   id SERIAL NOT NULL PRIMARY KEY,
   descripcion VARCHAR (100),
   nombre VARCHAR (40),
   estado VARCHAR (10),
   precio NUMERIC(6, 2)
);

INSERT INTO producto (descripcion, nombre, estado, precio)
    values ('Telefono Iphone 11', 'Iphone', 'Excelente', 50);