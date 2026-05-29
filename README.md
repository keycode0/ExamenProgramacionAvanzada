## Endpoint de prueba

Genera un eslogan ecológico para un producto usando IA.

**Método:** GET  
**URL:** `http://localhost:8085/espe-plus/api/productos/slogan/{nombre}`

| Parámetro | Tipo   | Descripción                       |
|-----------|--------|-----------------------------------|
| `nombre`  | String | Nombre del producto a promocionar |

**Ejemplo de petición:**  
GET http://localhost:8085/espe-plus/api/productos/slogan/bambu
Por defecto, aparece un prompt solicitando se agregue un producto en la URL.

**Ejemplo de respuesta:**  
¡Bambú: natural, fuerte y sostenible para un mundo mejor!
