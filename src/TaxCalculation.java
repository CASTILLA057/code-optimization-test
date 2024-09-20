public class TaxCalculation {
    public static void main(String[] args) {
        //Colocamos valores magicos a constantes
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final int TAX_THRESHOLD = 50;

        //Almacenamos en un array los precios de los productos y productos
        int[] productPrices = {100,200};
        double[] taxes = {TAX_RATE_HIGH,TAX_RATE_LOW};

        //un for que vaya encontrando el valor de los impuestos
        double sum_taxes = 0;
        for (int i = 0; i < productPrices.length; i++) {
            double price = productPrices[i];
            double tax = taxes[i];
            double totaltaxe = price * (tax);
            System.out.println("Precio del producto : " + price + ", Impuesto : " + tax + ", Total De impuesto : " + totaltaxe);
            sum_taxes += totaltaxe;
        }
        //Comprobamos si el impuesto es alto o bajo
        System.out.println("Comprobamos si el impuesto es mayor o menor que 50");
         if (sum_taxes > TAX_THRESHOLD) {
            System.out.println("Alto impuesto, el impuesto fue de : " + sum_taxes);
        } else {
            System.out.println("Bajo impuesto, el impuesto fue de : " + sum_taxes);
        }
    }
}

