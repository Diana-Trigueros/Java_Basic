public record Entrada_Record(String evento, double precio) {
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
