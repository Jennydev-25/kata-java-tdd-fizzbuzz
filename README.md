# 🔢 Kata FizzBuzz – Java con TDD

> Ejercicio de la kata FizzBuzz implementada en **Java 21 con Maven**, desarrollada siguiendo la metodología **TDD (Test-Driven Development)** y con cobertura de tests medida con **JaCoCo**.

---

## 📑 Índice

- [Descripción](#-descripción)
- [Enunciado](#-enunciado)
- [Cómo reproducir el proyecto](#-cómo-reproducir-el-proyecto)
- [Estructura del repositorio](#-estructura-del-repositorio)
- [Tecnologías](#️-tecnologías)
- [Autora](#-autora)

---

## 📋 Descripción

El objetivo de este proyecto es implementar la clásica kata **FizzBuzz** en Java, aplicando **TDD (Test-Driven Development)**. Cada regla del enunciado se construye como un pequeño ciclo de TDD, quedando reflejada en el historial de commits. El ciclo consiste en:

- 🔴 **Red** — escribir primero un test que falla.
- 🟢 **Green** — escribir el código mínimo para que ese test pase.
- 🔵 **Refactor** — limpiar el código sin romper los tests.

Los requisitos principales son:

1. **Implementar la clase `FizzBuzz`** con la lógica del enunciado (Etapa 1 y Etapa 2).
2. **Testear la clase** de forma completa, cubriendo todos los escenarios.
3. **Insertar un diagrama de clase** de `FizzBuzz` en el README.
4. **Insertar una captura de la cobertura de tests** (coverage) en el README.

---

## 📝 Enunciado

Escribe un programa que imprima los números del 1 al 100 aplicando las siguientes normas:

### Etapa 1

- Devuelve `Fizz` si el número es divisible por 3.
- Devuelve `Buzz` si el número es divisible por 5.
- Devuelve `FizzBuzz` si el número es divisible por 3 y por 5.
- Devuelve el mismo número si no se cumple ninguna de las reglas anteriores.

### Etapa 2

- Devuelve `Fizz` si el número es divisible por 3 **o** si contiene un 3 (ej.: `Fizz` si el número es 534).
- Devuelve `Buzz` si el número es divisible por 5 **o** si contiene un 5 (ej.: `Buzz` si el número es 25).

---

## 🚀 Cómo reproducir el proyecto

### Requisitos previos

- **[JDK 21](https://www.oracle.com/java/technologies/downloads/)** instalado.
- **[Apache Maven](https://maven.apache.org/download.cgi)** instalado y en el `PATH`.
- **[Git](https://git-scm.com/downloads)** para clonar el repositorio.

### Pasos

```bash
# 1. Clonar el repositorio
git clone https://github.com/Jennydev-25/kata-java-tdd-fizzbuzz.git
cd kata-java-tdd-fizzbuzz

# 2. Ejecutar los tests (genera además el reporte de cobertura de JaCoCo)
mvn test
```

El reporte de cobertura se genera en `target/site/jacoco/index.html`, que puedes abrir en el navegador.

---

## 📁 Estructura del repositorio

```text
kata-java-tdd-fizzbuzz/
├── assets/
│   └── images/
├── src/
│   ├── main/java/dev/jenny/fizzbuzz/
│   │   ├── App.java
│   │   └── FizzBuzz.java
│   └── test/java/dev/jenny/fizzbuzz/
│       ├── AppTest.java
│       └── FizzBuzzTest.java
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🛠️ Tecnologías

- **[Java 21](https://www.oracle.com/java/technologies/downloads/)** — Lenguaje de programación del proyecto.
- **[Apache Maven](https://maven.apache.org/)** — Gestor de dependencias y construcción del proyecto.
- **[JUnit 5](https://junit.org/junit5/)** — Framework de tests unitarios.
- **[Hamcrest](https://hamcrest.org/)** — Librería de _matchers_ para asserts más legibles.
- **[JaCoCo](https://www.jacoco.org/jacoco/)** — Medición de la cobertura de tests.
- **[Visual Studio Code](https://code.visualstudio.com/)** — Editor usado para desarrollar y gestionar el proyecto.
- **[Markdown](https://www.markdownguide.org/)** — Lenguaje de marcado para el README.
- **[Git](https://git-scm.com/)** / **[GitHub](https://github.com/)** — Control de versiones y alojamiento del proyecto.

---

## 👩‍💻 Autora

**[Jenny Sánchez Requejo](https://github.com/Jennydev-25)**
