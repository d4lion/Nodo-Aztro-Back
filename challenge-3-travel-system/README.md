
# 🛠️ Implementar clases que posean
- herencia.
- abstraccion.
- polimorfismo.
- encapsulamiento.
- anotaciones.

## 🧠 Planteamiento del problema
Se requiere definir el código inicial de un software de agencia de viajes en donde el usuario
pueda definir, bajo unos criterios, cuales son los mejores destinos apropiados para el
mismo.

### 🔴 Pasos a tener en cuenta
- El sistema posee una clase abstracta llamada `User` que posee entre sus atributos:
  - `nombre` de tipo `String`.
  - `apellido` de tipo `String`.
  - `Año de nacimiento` de tipo `LocalDate`.
  - `Edad` de tipo `int`.
  - `Email` de tipo `String`.

### 📝 Features del sistema
- Se tiene la posibilidad de tener un ArrayList de `Travels` donde se almacenan todos
los datos de los viajes.
- Si el usuario `TravelAdmin` lo desea tiene la posibilidad de actualizar los viajes.
- Todos los archivos que comparten paquete con `Client` tienen la posibilidad de que si cumplen
con heredad de `Admin` modificar la lista de datos de travel.
- Cada `Travel` posee un `UUID` unico el cual se genera al momento de crear el objeto.

## 📋 Diagrama de clases
![img.png](img.png)