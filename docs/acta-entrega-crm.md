# Acta de Entrega de CRM

## 1. Informacion general

| Campo | Detalle |
| --- | --- |
| Proyecto | Implementacion / entrega de CRM |
| Plataforma | Salesforce Marketing Cloud / CRM |
| Cliente / Area receptora | [Nombre del cliente o area] |
| Proveedor / Area entregadora | [Nombre del proveedor o area] |
| Fecha de entrega | 2026-06-01 |
| Ambiente entregado | [Produccion / QA / Sandbox] |
| Responsable tecnico | [Nombre y cargo] |
| Responsable funcional | [Nombre y cargo] |

## 2. Objetivo del acta

Dejar constancia formal de la entrega de los componentes CRM implementados, incluyendo Journeys, Data Extensions y CloudPages, junto con su alcance funcional, estado de configuracion, evidencias, dependencias y criterios de aceptacion para operacion y administracion posterior.

## 3. Alcance de la entrega

La presente entrega contempla los siguientes componentes:

- Configuracion y/o ajuste de Journeys para automatizacion de comunicaciones.
- Creacion, actualizacion o documentacion de Data Extensions requeridas para segmentacion, personalizacion, trazabilidad y operacion.
- Implementacion o entrega de CloudPages asociadas a formularios, landing pages, preferencias, confirmaciones o experiencias digitales.
- Documentacion funcional y tecnica necesaria para administracion, soporte y evolucion.
- Validaciones basicas de funcionamiento, integridad de datos y accesibilidad de activos.

Quedan fuera del alcance, salvo indicacion expresa:

- Cambios posteriores no aprobados en el alcance del proyecto.
- Integraciones adicionales no documentadas en esta acta.
- Desarrollo de nuevas automatizaciones, reportes o activos no listados en el inventario.
- Soporte operativo continuo fuera del periodo de garantia acordado.

## 4. Inventario de Journeys entregados

| # | Nombre del Journey | Business Unit | Objetivo | Entrada / Entry Source | Audiencia | Canales | Estado | Observaciones |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | [Nombre del Journey] | [BU] | [Objetivo funcional] | [DE / API / Event / Automation] | [Segmento] | [Email / SMS / Push / WhatsApp] | [Activo / Pausado / Borrador] | [Notas] |
| 2 | [Nombre del Journey] | [BU] | [Objetivo funcional] | [DE / API / Event / Automation] | [Segmento] | [Email / SMS / Push / WhatsApp] | [Activo / Pausado / Borrador] | [Notas] |

### 4.1 Validaciones realizadas sobre Journeys

| Validacion | Resultado | Evidencia / Comentario |
| --- | --- | --- |
| Entry Source configurado correctamente | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Criterios de entrada y reentrada revisados | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Actividades y ramas de decision configuradas | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Contenidos asociados publicados y vinculados | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Metas, exits o suppression rules revisadas | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Pruebas funcionales ejecutadas | [Aprobado / Pendiente / No aplica] | [Detalle] |

## 5. Inventario de Data Extensions entregadas

| # | Nombre de Data Extension | Customer Key / External Key | Ubicacion | Tipo | Retencion | Campos clave | Uso principal | Estado |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | [Nombre DE] | [Customer Key] | [Carpeta] | [Sendable / Non-sendable] | [Politica] | [SubscriberKey, Email, etc.] | [Segmentacion / Log / Preferencias] | [Activa / Pendiente] |
| 2 | [Nombre DE] | [Customer Key] | [Carpeta] | [Sendable / Non-sendable] | [Politica] | [SubscriberKey, Email, etc.] | [Segmentacion / Log / Preferencias] | [Activa / Pendiente] |

### 5.1 Estructura recomendada para documentar campos

| Data Extension | Campo | Tipo de dato | Longitud | Primary Key | Nullable | Descripcion |
| --- | --- | --- | --- | --- | --- | --- |
| [Nombre DE] | SubscriberKey | Text | 254 | Si | No | Identificador unico del contacto |
| [Nombre DE] | EmailAddress | EmailAddress | 254 | No | Si | Correo electronico del contacto |
| [Nombre DE] | CreatedDate | Date | - | No | Si | Fecha de creacion o carga del registro |

### 5.2 Validaciones realizadas sobre Data Extensions

| Validacion | Resultado | Evidencia / Comentario |
| --- | --- | --- |
| Nombres y Customer Keys documentados | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Campos, tipos de dato y llaves primarias revisados | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Configuracion sendable revisada cuando aplica | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Politicas de retencion verificadas | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Relaciones con Journeys, automatizaciones o CloudPages identificadas | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Pruebas de carga, consulta o actualizacion realizadas | [Aprobado / Pendiente / No aplica] | [Detalle] |

## 6. Inventario de CloudPages entregadas

| # | Nombre de CloudPage | URL / Link | Business Unit | Tipo | Objetivo | Data Extensions relacionadas | Estado | Observaciones |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | [Nombre CloudPage] | [URL] | [BU] | [Landing / Formulario / Confirmacion / Preferencias] | [Objetivo] | [DE asociadas] | [Publicada / Borrador] | [Notas] |
| 2 | [Nombre CloudPage] | [URL] | [BU] | [Landing / Formulario / Confirmacion / Preferencias] | [Objetivo] | [DE asociadas] | [Publicada / Borrador] | [Notas] |

### 6.1 Validaciones realizadas sobre CloudPages

| Validacion | Resultado | Evidencia / Comentario |
| --- | --- | --- |
| URL publicada y accesible | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Formularios o interacciones probadas | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Escritura o lectura en Data Extensions validada | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Mensajes de exito, error y confirmacion revisados | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Consentimientos, textos legales o politicas incluidos | [Aprobado / Pendiente / No aplica] | [Detalle] |
| Responsividad y visualizacion en dispositivos principales revisada | [Aprobado / Pendiente / No aplica] | [Detalle] |

## 7. Dependencias e integraciones

| Componente | Dependencia | Responsable | Estado | Observaciones |
| --- | --- | --- | --- | --- |
| [Journey / DE / CloudPage] | [API / Automation / SFTP / CRM / Data Source] | [Nombre / Area] | [Activo / Pendiente] | [Detalle] |

## 8. Accesos y permisos

| Recurso | Perfil / Rol requerido | Usuarios o grupos autorizados | Observaciones |
| --- | --- | --- | --- |
| Journeys | [Rol] | [Usuarios / Grupos] | [Detalle] |
| Data Extensions | [Rol] | [Usuarios / Grupos] | [Detalle] |
| CloudPages | [Rol] | [Usuarios / Grupos] | [Detalle] |

## 9. Evidencias de entrega

| Evidencia | Ubicacion / Enlace | Descripcion |
| --- | --- | --- |
| Capturas de Journeys | [Link o ruta] | [Detalle] |
| Export de Data Extensions / esquema | [Link o ruta] | [Detalle] |
| URLs de CloudPages | [Link o ruta] | [Detalle] |
| Resultados de pruebas | [Link o ruta] | [Detalle] |
| Documentacion adicional | [Link o ruta] | [Detalle] |

## 10. Pendientes, riesgos y recomendaciones

| Tipo | Descripcion | Responsable | Fecha objetivo | Prioridad |
| --- | --- | --- | --- | --- |
| Pendiente | [Descripcion] | [Responsable] | [Fecha] | [Alta / Media / Baja] |
| Riesgo | [Descripcion] | [Responsable] | [Fecha] | [Alta / Media / Baja] |
| Recomendacion | [Descripcion] | [Responsable] | [Fecha] | [Alta / Media / Baja] |

## 11. Criterios de aceptacion

La entrega se considerara aceptada cuando:

- Los Journeys listados se encuentren configurados en el ambiente acordado y con estado documentado.
- Las Data Extensions requeridas esten creadas, documentadas y disponibles para los procesos definidos.
- Las CloudPages listadas se encuentren publicadas o en el estado acordado, con URLs y dependencias documentadas.
- Las validaciones funcionales y tecnicas descritas en esta acta hayan sido revisadas por las partes.
- Los pendientes, si existen, queden identificados con responsable y prioridad.
- El area receptora confirme que cuenta con los accesos, evidencias y documentacion necesarios para operar los componentes entregados.

## 12. Aprobacion y firmas

Con la firma de esta acta, las partes dejan constancia de la entrega y recepcion de los componentes descritos, sujetos a los pendientes y observaciones registrados.

| Rol | Nombre | Cargo / Area | Firma | Fecha |
| --- | --- | --- | --- | --- |
| Entrega | [Nombre] | [Cargo / Area] |  | [Fecha] |
| Recibe | [Nombre] | [Cargo / Area] |  | [Fecha] |
| Aprobacion funcional | [Nombre] | [Cargo / Area] |  | [Fecha] |
| Aprobacion tecnica | [Nombre] | [Cargo / Area] |  | [Fecha] |

## 13. Anexos

- Anexo A: Detalle tecnico de Journeys.
- Anexo B: Diccionario de datos de Data Extensions.
- Anexo C: Evidencias de pruebas de CloudPages.
- Anexo D: Manual operativo o guia de administracion.
