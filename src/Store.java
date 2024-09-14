public class Store {
    public static void main(String[] args) {
        //Definimos la cantidad de ventas que se deben hacer minimo en el local
        final int LIMITE_VENTAS = 50;
    //Matriz con precio (en la fila 0) y cantidades de ventas (fila 1) ,utilizamos multidimensional
    int [][] PRODUCTS = {
        {15,10,5},
        {2,3,4}
    };
    //Calculando  el total de ventas
    int VENTAS_TOTALES = 0;
    for (int i = 0; i < PRODUCTS[0].length; i++) {
        VENTAS_TOTALES += PRODUCTS[0][i] * PRODUCTS[1][i];
    }  
    //Evaluar el rendimiento de ventas
    if( VENTAS_TOTALES > LIMITE_VENTAS) {
        System.out.println("Buen rendimiento de ventas");
       } else {
             System.out.println("Bajo rendimiento de ventas");
    }
  }  
}
