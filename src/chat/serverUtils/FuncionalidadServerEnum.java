package chat.serverUtils;

public enum FuncionalidadServerEnum {
	
	LOGIN(1),
	CARGARDATOSINICIALES(2),
	NUEVOUSUARIO(3),	
	ENVIARMENSAJE(4),
	NUEVASALA(5),	
	NUEVOCONTACTO(6),	
	AGREGARUSUARIOSALA(7),
	INVITARCONTACTO(8),
	LOGOFF(9);
	
	private int valor;
    private FuncionalidadServerEnum(int valor) {
        this.valor = valor;
    }
	
}
