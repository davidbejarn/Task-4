# MyArrayList y MyLinkedList


## MyArrayList

### Ventajas
- **Acceso rápido**: Proporciona acceso constante a los elementos mediante índices, lo que es ideal para operaciones de lectura.
- **Uso de memoria**: Suele ser más eficiente en memoria para listas de tamaño fijo o cuando no se realizan muchas inserciones o eliminaciones.
- **Simplicidad**: Implementación más sencilla, ya que utiliza un array para almacenar los elementos.

### Desventajas
- **Redimensionamiento**: Cuando se supera la capacidad del array, se necesita crear un nuevo array y copiar los elementos, lo que puede ser bastante trabajo.
- **Inserciones y eliminaciones lentas**: Las operaciones de inserción y eliminación en medio de la lista son costosas, ya que, se deben mover los elementos.
- **Espacio desperdiciado**: Puede haber espacio no utilizado en el array si se reducen los elementos.

### Métodos Clave
- `add(int index, E e)`: Inserta un elemento en un índice específico.
- `remove(int index)`: Elimina el elemento en un índice específico.
- `get(int index)`: Devuelve el elemento en el índice especificado.
- `set(int index, E e)`: Reemplaza el elemento en un índice específico.

---

## MyLinkedList

### Ventajas
- **Inserciones y eliminaciones eficientes**: Operaciones de inserción y eliminación en cualquier posición son rápidas, ya que, solo se necesitan cambiar referencias.
- **No necesita redimensionamiento**: La lista crece y decrece dinámicamente sin necesidad de redimensionar un array.
- **Uso eficiente del espacio**: No desperdicia espacio, ya que solo ocupa lo necesario para los elementos.

### Desventajas
- **Acceso más lento**: El acceso a los elementos es más lento, ya que, se debe recorrer la lista desde el inicio.
- **Mayor uso de memoria**: Cada nodo tiene un sobrecoste adicional de memoria debido a la referencia al siguiente nodo.
- **Complejidad**: La implementación puede ser más complicada.

### Métodos Clave
- `add(int index, E e)`: Inserta un elemento en un índice específico.
- `remove(int index)`: Elimina el elemento en un índice específico.
- `get(int index)`: Devuelve el elemento en el índice especificado.
- `addFirst(E e)`: Agrega un elemento al inicio de la lista.
- `addLast(E e)`: Agrega un elemento al final de la lista.

---

## Diferencias Clave

| Característica          | MyArrayList                  | MyLinkedList                    |
|-------------------------|------------------------------|---------------------------------|
| **Estructura**          | Array                        | Lista enlazada     |              
| **Memoria**             | Menos uso por elemento       | Más uso debido a referencias    |
| **Redimensionamiento**   | Necesario                    | No necesario                    |

### Referencias

- StackOverFlow. (2018).  https://es.stackoverflow.com/questions/172954/cuando-es-mejor-usar-linkedlist-y-cuando-arraylist
- OpenAI. (2024). *ChatGPT: AI Language Model*. https://www.openai.com/chatgpt
- Reddit. (2020). https://www.reddit.com/r/learnjava/comments/khiycg/arraylist_vs_linkedlist/?tl=es-es
- Liang, Y. D. (2019). *Introduction to Java Programming and Data Structures: Comprehensive Version* (12th ed.). Georgia Southern University.
