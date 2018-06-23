package tests;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import asistente.Asistente;

public class RF13Tests {	
	
	public final static String USUARIO = "delucas";

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}
	
	@Test
	public void ChuckNorrisFacts() throws ParseException, IOException {
		Assert.assertEquals(
				"Chuck Norris arroj� una granada y mat� a 50 personas, luego explot�.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris cont� hasta el infinito. Dos veces.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede matar dos piedras con un p�jaro.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede recoger naranjas de un manzano y hacer la mejor limonada que haya probado en su vida.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede escuchar lenguaje de se�as.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Las jirafas fueron creadas cuando Chuck Norris golpe� un caballo.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Una vez, una cobra mordi� la pierna de Chuck Norris. Despu�s de cinco d�as de dolor insoportable, la cobra muri�.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Cuando Chuck Norris estaba en la escuela secundaria, su profesor de ingl�s le asign� un ensayo: '�Qu� es el coraje?' Recibi� un A + por entregar una p�gina en blanco con solo su nombre en la parte superior.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"No existe una teor�a de la evoluci�n, solo una lista de las criaturas que Chuck Norris permite vivir.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris aliment� a su madre a trav�s del cord�n umbilical mientras lo llevaba.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Cuando Chuck Norris se fue a la universidad, mir� a su padre. Y dijo: 'Ahora eres el hombre de la casa'.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede pararse en el fondo de un pozo sin fondo.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris nunca tendr� un ataque al coraz�n ... incluso un coraz�n no es tan tonto como para atacar a Chuck Norris.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede matar a tus amigos imaginarios.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris golpe� al sol en un concurso de miradas.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris es la �nica persona que puede golpear un c�clope entre los ojos.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Se considera un gran logro bajar por las cataratas del Ni�gara en un barril de madera. Chuck Norris puede subir a las Cataratas del Ni�gara en una caja de cart�n.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede construir un mu�eco de nieve con lluvia.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede estrangularte con un tel�fono inal�mbrico.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"En una ocasi�n, Chuck Norris fue acusado de tres intentos de asesinato en el condado de Boulder, pero el juez r�pidamente retir� los cargos porque Chuck Norris no 'intent�' el asesinato.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Los principales desinfectantes para manos afirman que pueden matar el 99.9 por ciento de los g�rmenes. Chuck Norris puede matar al 100 por ciento de lo que sea que �l quiera.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"El calendario de Chuck Norris va directamente del 31 de marzo al 2 de abril. Nadie enga�a a Chuck Norris.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris puede frotar dos pedazos de fuego y hacer madera.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Cuando comienza un apocalipsis zombie, Chuck Norris no intenta sobrevivir. Los zombies lo hacen.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck puede prender fuego a las hormigas con una lupa. Por la noche.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris una vez fue a Marte. Es por eso que no hay signos de vida.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris hace llorar a las cebollas.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris conoce el secreto de Victoria.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"La raz�n por la que el Santo Grial nunca se ha recuperado es porque nadie es lo suficientemente valiente como para pedirle a Chuck Norris que renuncie a su taza de caf� favorita.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Cuando Bruce Banner se enoja, se convierte en Hulk. Cuando Hulk se enoja se convierte en Chuck Norris. Cuando Chuck Norris se enoja, corre.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"Chuck Norris es la raz�n por la que Waldo se est� escondiendo.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);
			Assert.assertEquals(
				"El tipo de sangre de Chuck Norris es AK-47.",
				jenkins.escuchar("@jenkins quiero datos de chuck norris")
			);	
	}
	
}
