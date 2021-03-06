package chat.cliente.userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import chat.cliente.Cliente;
import chat.serverUtils.FuncionalidadServerEnum;
import chat.serverUtils.ServerRequest;
import hibernate.usuario.UsuarioController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class NuevoUsuario extends JFrame {
	
	private JPanel contentPane;
	private JTextField lblNombreNuevoUsuario;
	private JPasswordField lblPassNuevoUsuario;
	private Cliente cliente;

	public NuevoUsuario(Cliente cliente) {
		this.cliente = cliente;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\AddNew.png"));
		lblNewLabel.setBounds(10, 11, 123, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblCrearNuevoUsuario = new JLabel("Crear nuevo usuario");
		lblCrearNuevoUsuario.setBounds(165, 29, 206, 14);
		contentPane.add(lblCrearNuevoUsuario);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setBounds(10, 104, 123, 14);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setBounds(25, 145, 97, 14);
		contentPane.add(lblContrasea);
		
		lblNombreNuevoUsuario = new JTextField();
		lblNombreNuevoUsuario.setBounds(143, 101, 278, 20);
		contentPane.add(lblNombreNuevoUsuario);
		lblNombreNuevoUsuario.setColumns(10);
		
		lblPassNuevoUsuario = new JPasswordField();
		lblPassNuevoUsuario.setColumns(10);
		lblPassNuevoUsuario.setBounds(143, 142, 278, 20);
		contentPane.add(lblPassNuevoUsuario);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				if(lblNombreNuevoUsuario.getText().equals("")|| lblPassNuevoUsuario.getPassword().toString().equals("")) {
					new MensajeInterfaz("Debe ingresar la información necesaria");
					return;
				} 	        
				
		        HashMap<String, Object> map = new HashMap<String,Object>();			        
		        map.put("nombreUsuario", lblNombreNuevoUsuario.getText().toLowerCase());
		        map.put("passUsuario",new String(lblPassNuevoUsuario.getPassword()).toLowerCase());
		        
		        ServerRequest request = new ServerRequest(map,FuncionalidadServerEnum.NUEVOUSUARIO);
				Gson gson = new Gson();					
				String requestJson = gson.toJson(request);
				
				cliente.getThreadEscritura().AddRequest(requestJson);
			}
		});
		btnCrear.setFont(new Font("Arial", Font.BOLD, 11));
		btnCrear.setBounds(97, 205, 116, 20);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Cancelar");		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 11));
		btnCancelar.setBounds(236, 205, 116, 20);
		contentPane.add(btnCancelar);
		
		cliente.getThreadLectura().addPantalla("nuevoUsuario", this);
		setVisible(true);
	}
	
	public void notificarCreacionNuevoUsuario(boolean creadoConExito) {		
		if(creadoConExito) {			
			new MensajeInterfaz("El usuario se creó con éxito");
			dispose();
		}
		else
			new MensajeInterfaz("El usuario ya existe dentro del chat");				
	}
}
