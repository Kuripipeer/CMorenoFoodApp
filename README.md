---

# CMorenoFoodApp

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blueviolet?logo=kotlin)
![Android](https://img.shields.io/badge/Android-8.0%20\(Oreo\)-3DDC84?logo=android)
![Gradle](https://img.shields.io/badge/Gradle-KTS-success?logo=gradle)
![Coil](https://img.shields.io/badge/Images-Coil-orange)

Aplicación móvil de comida (FoodApp) desarrollada como proyecto parcial de la universidad.

---

## 🧾 Tabla de contenido

1. Descripción
2. Características principales
3. Tecnologías usadas
4. Instalación y puesta en marcha
5. Uso / flujo de la aplicación
6. Estructura del proyecto

---

## 1. Descripción

CMorenoFoodApp es una **maqueta de aplicación móvil** cuyo objetivo es mostrar el diseño y flujo básico de una app de pedidos de comida. Actualmente no tiene funcionalidad completa (no procesa pedidos reales), pero sirve para demostrar competencias en:

* Diseño de interfaces móviles.
* Organización modular del código.
* Integración de imágenes desde la web.

---

## 2. Características principales

* Visualización de listados de restaurantes/menú.
* Selección de platillos y añadido al carrito (solo maqueta).
* Interfaz intuitiva y modular.
* Carga de imágenes desde la web usando **Coil**.

---

## 3. Tecnologías usadas

* **Kotlin** como lenguaje principal.
* **Android Studio** como IDE.
* **Gradle / Kotlin DSL** para la configuración de build.
* **Coil** para carga de imágenes desde la web.
* Compatible con **Android 8.0 Oreo (API 26)** en adelante.

---

## 4. Instalación y puesta en marcha

```bash
# 1. Clonar el repositorio
git clone https://github.com/Kuripipeer/CMorenoFoodApp.git

# 2. Entrar al directorio del proyecto
cd CMorenoFoodApp

# 3. Abrir en Android Studio

# 4. Asegurarse de tener instalado el SDK de Android (8.0 Oreo / API 26)

# 5. Construir el proyecto
./gradlew build

# 6. Ejecutar en emulador o dispositivo físico
```

---

## 5. Uso / flujo de la aplicación

* Pantalla de inicio → lista de restaurantes.
* Selección de restaurante → menú correspondiente.
* Añadir platillos al carrito (simulado, sin backend).
* Visualización de imágenes cargadas desde la web (Coil).

*(Puedes agregar capturas de pantalla aquí para ilustrar la experiencia de usuario.)*

---

## 6. Estructura del proyecto

```
CMorenoFoodApp/
├── app/                 # Código principal de la aplicación
├── build.gradle.kts     # Configuraciones de build
├── settings.gradle.kts
├── gradle/
├── .gitignore
└── README.md
```

Dentro de `app/` se organizan los módulos principales de la aplicación (`ui`, `data`, `models`, etc.).

---
