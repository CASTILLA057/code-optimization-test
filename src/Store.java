public class Store {
    public static void main(String[] args) {
        //Definimos la cantidad de ventas que se deben hacer minimo en el local
        final int LIMITE_VENTAS = 50;
        //Definimos las contastntes que serian el precio de los productos 1,2 y 3
        final int PRICE_PRODUCT_1 = 15;
        final int PRICE_PRODUCT_2 = 10;
        final int PRICE_PRODUCT_3 = 5;
     
    //Matriz con precio (en la fila 0) y cantidades de ventas (fila 1)
    int [][] PRODUCTS = {
        {PRICE_PRODUCT_1, PRICE_PRODUCT_2, PRICE_PRODUCT_3},
        {2,3,4}
    };
    //Calculando  el total de ventas
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
