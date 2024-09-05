# Evaluación 1: Aplicaciones Móviles para IoT

**Asignatura:** Aplicaciones Móviles para IoT  
**Evaluación:** 1  
**Estudiante:** Ignacio Sekhard  
**Proyecto:** Convertidor de Unidades

---

## Descripción del Proyecto

Este proyecto consiste en el desarrollo de una aplicación móvil para Android que permite convertir diferentes unidades de medida. La aplicación cuenta con una interfaz simple que permite al usuario ingresar un valor y seleccionar el tipo de conversión que desea realizar, mostrando los resultados en una segunda pantalla. Las conversiones disponibles incluyen:

- Fahrenheit a Celsius y viceversa
- Centímetros a Metros y viceversa
- Metros a Kilómetros y viceversa
- Libras a Kilos y viceversa
- Dólares a Euros y viceversa

---

## Estructura del Proyecto

El proyecto está compuesto por dos actividades principales:

1. **MainActivity**: La actividad principal donde el usuario ingresa el valor a convertir y selecciona el tipo de conversión.
2. **MainActivity2**: La actividad secundaria que muestra los resultados de la conversión, incluyendo el valor ingresado y el resultado final.

### Funcionalidades Implementadas

- **Entrada de datos**: Un `EditText` donde el usuario puede ingresar el valor numérico que desea convertir.
- **Botones de conversión**: Nueve botones que permiten realizar diferentes conversiones entre unidades de medida.
- **Interfaz clara y sencilla**: Un diseño minimalista que guía al usuario paso a paso en el proceso de conversión.
- **Validación de datos**: La aplicación valida que el campo de texto no esté vacío antes de realizar una conversión.
- **Resultados de conversión**: Se presenta el valor original y el resultado de la conversión en una segunda pantalla.

---

## Diseño de la Interfaz

### MainActivity (Interfaz Principal)

- El usuario ingresa el valor que desea convertir en un campo de texto.
- Se muestran varios botones que representan las diferentes conversiones.  
- Cada botón lleva al usuario a una segunda pantalla donde se muestra el resultado.

```plaintext
+-----------------------------+
|   Valor a Convertir          |
|   [__________]               |
+-----------------------------+
| [ Far/C° ]  [ C°/Far ]       |
| [ cms/mts ] [ mts/cms ]      |
| [ mts/kms ] [ kms/mts ]      |
| [ lbs/kgs ] [ kgs/lbs ]      |
| [ dol/euros ] [ euros/dol ]  |
+-----------------------------+
