# ICC-Practica02-LOjeda

## Práctica 2: Simulación de Inversión

* **Materia:** Introducción a Ciencias de la Computación
* **Facultad:** Facultad de Ciencias, UNAM
* **Autor:** Ojeda Cruz Luis Ángel
* **Profesor:** Salvador López Mendoza
* **Ayudante:** Yanahí Demerio Torres
* **Ayudante de Laboratorio:** Rosa Victoria Villa Padilla
* **Fecha de entrega:** 13 de noviembre de 2026

---

## Descripción general

Este proyecto implementa un simulador bancario de inversiones en Java compuesto por dos clases principales: una clase de dominio (`Fecha`) encargada de representar y operar fechas del calendario, y una clase ejecutable (`TiempoDeInversion`) que interactúa con el usuario para calcular la duración en días de una inversión y su rendimiento proporcional a una tasa anual del **12%**.

El desarrollo sigue estrictamente los conceptos fundamentales de Programación Orientada a Objetos vistos en clase (sin uso de arreglos, estructuras `switch` ni librerías externas de fechas como `java.time` o `Calendar`), empleando únicamente tipos primitivos, operadores aritméticos y lógicos, condicionales `if-else`, ciclos `do-while`, la clase `String` y `Scanner`.

---

## Estructura del repositorio

```text
ICC-Practica02-LOjeda/
└── LOjeda/
    └── practica02/
        └── src/
            └── icc/
                ├── Fecha.java
                └── TiempoDeInversion.java
```

---

## Componentes implementados

### 1. `Fecha.java`
Modela una fecha mediante los atributos encapsulados (`private`) `dia`, `mes`, `anio` y `mestex`, e incluye:

* **Constructores sobrecargados:**
  * `Fecha()`: Constructor por omisión que inicializa una fecha válida por defecto (`08/agosto/2007`).
  * `Fecha(int d, int m, int a)`: Inicializa la fecha a partir de día, número de mes y año.
  * `Fecha(int d, String m, int a)`: Inicializa la fecha a partir de día, nombre del mes y año.
* **Métodos inspectores (`obtener...`):** `obtenerDia()`, `obtenerMes()`, `obtenerAnio()` y `obtenerMestex()`.
* **Métodos modificadores (`asignar...`):** `asignarDia(int)`, `asignarMes(int)`, `asignarMes(String)`, `asignarAnio(int)` y las versiones sobrecargadas de `asignarFecha(...)`.
* **Conversión de meses:**
  * `numeroDeMes(String)`: Convierte el nombre de un mes (ignorando mayúsculas y espacios extra) a su número correspondiente (`1` a `12`).
  * `nombreDeMes(int)`: Devuelve el nombre del mes correspondiente a un número (`1` a `12`).
* **Cálculos de calendario (con soporte para años bisiestos):**
  * `esBisiesto(int)`: Método auxiliar privado que verifica si un año es bisiesto (`(a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)`).
  * `diasTranscurridos()`: Calcula los días transcurridos en el año en curso hasta la fecha del objeto.
  * `diferenciaDias(Fecha)`: Calcula la diferencia exacta en días entre dos fechas.
  * `obtenerFecha(int)`: Calcula y devuelve una nueva instancia de `Fecha` al sumar o restar una cantidad entera de días (positivos o negativos).
* **Comparación y representación:**
  * `esIgual(Fecha)` y `equals(Object)`: Comparan el estado de dos objetos `Fecha` para determinar si representan el mismo día, mes y año.
  * `toString()`: Devuelve la fecha formateada como `dd/mes/aaaa` (por ejemplo, `03/septiembre/2013`).

### 2. `TiempoDeInversion.java`
Contiene el método `main` que ejecuta el flujo interactivo de la simulación:

1. Da la bienvenida y solicita el nombre del inversionista una sola vez al inicio.
2. Dentro de un ciclo `do-while`, saluda al usuario y solicita el monto a invertir, la fecha de inicio y la fecha de fin.
3. Calcula los días transcurridos entre ambas fechas mediante `fechaInicio.diferenciaDias(fechaFin)`.
4. Calcula el rendimiento proporcional a los días de la inversión con una tasa anual del 12%:
   $$\text{rendimiento} = \frac{\text{monto} \times 0.12 \times \text{días}}{365}$$
5. Muestra el resumen de la operación y pregunta si se desea realizar una nueva simulación (`si`/`sí`), regresando a la solicitud del monto o finalizando el programa.

---

## Compilación y ejecución

1. Ubícate en el directorio donde se encuentran los archivos fuente:
   ```bash
   cd LOjeda/practica02/src/icc
   ```

2. Compila ambas clases:
   ```bash
   javac Fecha.java TiempoDeInversion.java
   ```

3. Ejecuta el programa principal:
   ```bash
   java TiempoDeInversion
   ```

### Generación de documentación (Javadoc)
Para generar la documentación HTML a partir de los comentarios Javadoc incluidos en el código:
```bash
javadoc -d doc Fecha.java TiempoDeInversion.java
```
