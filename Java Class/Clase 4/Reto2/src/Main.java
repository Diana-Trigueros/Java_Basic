public class Main {
    public static void main(String[] args) {

        // Creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Creamos una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostramos la información
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}