public class contacto
    {
        private String nombre;
        private String telefono;
        public contacto(){ //constructor
            nombre = "";
            telefono = "";
        }
        public contacto(String nombre, String telefono){ //constructor
            this.nombre = nombre;
            this.telefono = telefono;
        }
        public String get_nombre() { //sets y gets
            return this.nombre;
        }
        public String get_telefono() { //sets y gets
            return this.telefono;
        }
    }