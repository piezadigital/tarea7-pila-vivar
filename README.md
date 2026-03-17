📘 Implementación de TDA Pila - Bitácora de Eventos

Este proyecto es una implementación de un TDA (Tipo de Dato Abstracto) Pila en Java, utilizada para gestionar una bitácora de eventos en un sistema.

La estructura sigue el principio LIFO (Last In, First Out), donde el último evento registrado es el primero en ser eliminado.

🧠 Características

Implementación manual de una pila usando arreglos

Operaciones soportadas:

- push (registrar evento)
- pop (eliminar último evento)
- peek (consultar último evento)
- size (cantidad de elementos)
- Validación de pila vacía y llena
- Manejo de errores con excepciones (IllegalStateException)

📁 Estructura del Proyecto
    
    PROYECTO/
    │
    ├── src/
    │   ├── Main.java
    │   └── BitacoraStack.java
    │
    └── README.md

⚙️ Requisitos

- Java JDK 21 o superior
- Terminal (Linux, macOS o Windows CMD/PowerShell)
- Verifica tu versión con: java -version

▶️ Compilación y Ejecución
🔹 Opción 1: Ejecutar directamente (Java 11+)

    Desde la raíz del proyecto:

    java src/Main.java

🔹 Opción 2: Compilar y ejecutar manualmente

    Compilar:
    javac src/*.java

    Ejecutar:
    java -cp src Main
🧪 Ejecución esperada

El programa simula una bitácora de eventos donde:

Se registran múltiples eventos

Se detecta un error crítico

Se activa un protocolo de eliminación de eventos (uso de pop)

Se muestra el estado final de la pila

⚠️ Notas importantes

La pila tiene un tamaño fijo definido al momento de su creación

Si la pila está llena, no se pueden agregar más elementos

Si está vacía, no se pueden eliminar elementos

Se lanzan excepciones en operaciones inválidas

👨‍💻 Autor

Proyecto desarrollado como práctica de estructuras de datos (TDA Pila) en Java.