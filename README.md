# Implementación de un proyecto con BDD, TDD y DDD

En el contexto de una plataforma fintech que gestiona carteras de inversión, necesitas implementar un sistema que permita a los usuarios crear, modificar y eliminar carteras. El sistema debe asegurarse de que los nombres de las carteras sean únicos y que los cambios se realicen de manera segura y consistente. Utilizarás metodologías de desarrollo BDD, TDD y DDD para garantizar la calidad y la coherencia del código.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Metodologías de desarrollo BDD, TDD y DDD |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del dominio y requisitos

**Objetivo:** Identificar y documentar los requisitos del dominio para la gestión de carteras de inversión.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los elementos clave del dominio (cartera, usuario, inversión, etc.)
- Documenta las reglas de negocio y las restricciones (nombres únicos, validación de datos, etc.)

**Entregable:** Documento de requisitos del dominio

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en los diferentes estados que puede tener una cartera (creada, modificada, eliminada)
- Considera los posibles errores y cómo manejarlos

</details>

### Fase 2: Implementación con TDD

**Objetivo:** Implementar las funcionalidades básicas del sistema utilizando TDD.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Escribe pruebas unitarias para cada funcionalidad (crear, modificar, eliminar carteras)
- Implementa el código necesario para pasar las pruebas

**Entregable:** Código funcional con pruebas unitarias

<details>
<summary>Pistas de conocimiento</summary>

- Comienza por las pruebas más simples y ve aumentando la complejidad
- Asegúrate de que cada prueba verifica una funcionalidad específica

</details>

### Fase 3: Aplicación de BDD

**Objetivo:** Aplicar BDD para escribir pruebas de aceptación que describan el comportamiento del sistema desde la perspectiva del usuario.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Escribe historias de usuario que describan el comportamiento esperado del sistema
- Implementa pruebas de aceptación que verifiquen esas historias

**Entregable:** Pruebas de aceptación escritas con BDD

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en el usuario final y cómo interactúa con el sistema
- Asegúrate de que las pruebas de aceptación sean comprensibles para no técnicos

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una cartera de inversión en el contexto de este sistema?
- **paraQueSirve**: ¿Para qué sirve la aplicación de TDD en este proyecto?
- **comoSeUsa**: ¿Cómo se usa BDD para escribir pruebas de aceptación?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar TDD?
- **queDecisionesImplica**: ¿Qué decisiones implica la aplicación de DDD en este proyecto?

## Criterios de Evaluacion

- Identificar y documentar los requisitos del dominio.
- Implementar funcionalidades básicas utilizando TDD.
- Escribir pruebas de aceptación con BDD.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
