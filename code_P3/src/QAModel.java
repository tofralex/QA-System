/*
UNIVERSIDAD POLITÉCNICA DE MADRID

MASTER EN INTELIGENCIA ARTIFICIAL

PRACTICA 3 DE INGENIERIA LINGUISTICA: EXTRACCIÓN DE INFORMACIÓN

Alumno 1: Francisco Toral, ALEJANDRO
Alumno 2: Martín López, ENRIQUE
 */

import java.text.Normalizer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QAModel {

	// Inicializar la lista de recetas
	private static List<Receta> recetas;

	// Inicializar las listas de palabras clave
	private static HashMap<String, List<String>> keywords;

	// Definir las frases modelo
	// Se usarán para determinar las respuestas clave y redirigir las preguntas que hagan los usuarios
	private final static String FRASE_NOMBRE = "¿Qué recetas hay disponibles?";
	private final static String FRASE_INGREDIENTES = "¿Qué ingredientes tiene x?";
	private final static String FRASE_CANTIDADES = "¿Cuáles son las cantidades necesarias para hacer x?";
	private final static String FRASE_ORIGEN = "¿De dónde procede x?";
	private final static String FRASE_DIFICULTAD = "¿Cuál es la dificultad de hacer x?";
	private final static String FRASE_TIEMPO = "¿Cuánto se tarda en hacer x?";
	private final static String FRASE_CALORIAS = "¿Cuál es la cantidad de calorías de x?";
	private final static String FRASE_VEGETARIANA = "¿x es una receta vegetariana?";
	private final static String FRASE_HERRAMIENTAS = "¿Cuáles son las herramientas de cocina necesarias para hacer x?";
	private final static String FRASE_METODOS = "¿Cuáles son los métodos de cocinar empleados al hacer x?";
	private final static String FRASE_INSTRUCCIONES = "¿Cómo se hace x?";
	private final static String FRASE_PERSONAS = "¿Para cuántas personas es la receta de x?";

	// Programa principal
	public static void main(String[] args) {
	
		// Inicializar recetas
		// Cochillino asado
		Receta cochinilloAsado = new Receta();
		cochinilloAsado.setNombre("Cochinillo asado");
		cochinilloAsado.setDificultad("Dificil");
		cochinilloAsado.setEsVegetariano(false);
		List<String> herramientasCocina = new LinkedList<>();
		herramientasCocina.add("Horno");
		herramientasCocina.add("Recipiente de horno");
		herramientasCocina.add("Barniz");
		herramientasCocina.add("Papel de aluminio");
		cochinilloAsado.setHerramientasDeCocina(herramientasCocina);
		List<Ingrediente> ingredientes = new LinkedList<>();
		ingredientes.add(new Ingrediente("Agua", 300, "ccs"));
		ingredientes.add(new Ingrediente("Cochinillo Blanco Entero", 4, "kilos"));
		ingredientes.add(new Ingrediente("Laurel", 2, "hojas"));
		ingredientes.add(new Ingrediente("Manteca De Cerdo", 100, "gramos"));
		ingredientes.add(new Ingrediente("Sal", 1, "pellizco"));
		ingredientes.add(new Ingrediente("Vinagre", 1, "chorreón"));
		cochinilloAsado.setIngredientes(ingredientes);
		List<String> instruccionesDeElaboracion = new LinkedList<>();
		instruccionesDeElaboracion.add("Paso 1: Pedir en la carnicería que limpien y preparen el cochinillo, quitándole la asadura y practicándole sólo una pequeña abertura en el vientre, lo justo para poderlo vaciar y limpiar. Salar y coser para que quede bien cerrado. ");
		instruccionesDeElaboracion.add("Paso 2: Calentar el horno a 220-230º centígrados y poner el cochinillo en un recipiente, con las manos hacia arriba y sobre unas tablitas o unos palitos de laurel, colocarlo de manera que se sostenga sin moverse. ");
		instruccionesDeElaboracion.add("Paso 3: Agregar agua y cocer durante 2 horas aproximadamente.");
		instruccionesDeElaboracion.add("Paso 4: Transcurrido éste tiempo, sacar, darle la vuelta y pinchar con un tenedor para que suelte el agua que haya podido absorber.");
		instruccionesDeElaboracion.add("Paso 5: Barnizar con un poco de manteca de cerdo para que resulte brillante.");
		instruccionesDeElaboracion.add("Paso 6: Proteger las orejas y el rabo con un poco de papel de aluminio para que no se quemen e introducir de nuevo en el horno 1 hora o más.");
		instruccionesDeElaboracion.add("Paso 7: En el último momento rociar con el vinagre. Debe quedar con la corteza dorada y crujiente, de manera que, apretando un poquito con el dedo, chasque como si fuera un pastel de hojaldre.");
		cochinilloAsado.setInstruccionesDeElaboracion(instruccionesDeElaboracion);
		cochinilloAsado.setMinPreparacion(300);
		cochinilloAsado.setNumeroDePersonas(8);
		List<String> tipoPrep = new LinkedList<>();
		tipoPrep.add("Hornear");
		tipoPrep.add("Cocer");
		cochinilloAsado.setTipoDePreparacion(tipoPrep);
		cochinilloAsado.setCantidadCalorias("Alta");
		cochinilloAsado.setNacionalidad("Segoviana");

		// Pote gallego
		Receta poteGallego = new Receta();
		poteGallego.setNombre("Pote gallego");
		poteGallego.setDificultad("Media");
		poteGallego.setEsVegetariano(false);
		herramientasCocina = new LinkedList<>();
		herramientasCocina.add("Olla");
		herramientasCocina.add("Malla");
		herramientasCocina.add("Cacerola");
		herramientasCocina.add("Bandeja");
		poteGallego.setHerramientasDeCocina(herramientasCocina);
		ingredientes = new LinkedList<>();
		ingredientes.add(new Ingrediente("Careta de cerdo en trozos", 150, "gramos"));
		ingredientes.add(new Ingrediente("Chorizo", 4, "unidades"));
		ingredientes.add(new Ingrediente("Falda de cordero en trozos", 150, "gramos"));
		ingredientes.add(new Ingrediente("Garbanzos", 750, "gramos"));
		ingredientes.add(new Ingrediente("Grelos", 1, "kilo"));
		ingredientes.add(new Ingrediente("Hueso de caña", 1, "unidad"));
		ingredientes.add(new Ingrediente("Jamón en trozos", 150, "gramos"));
		ingredientes.add(new Ingrediente("Patatas", 300, "gramos"));
		ingredientes.add(new Ingrediente("Tocino fresco en trozos", 150, "gramos"));
		ingredientes.add(new Ingrediente("Aceite", 50, "ccs"));
		ingredientes.add(new Ingrediente("Sal", 1, "pizca"));
		poteGallego.setIngredientes(ingredientes);
		instruccionesDeElaboracion = new LinkedList<>();
		instruccionesDeElaboracion.add("Paso 1: Se ponen los garbanzos la noche anterior en remojo. ");
		instruccionesDeElaboracion.add("Paso 2: Se pone la carne en una olla con agua fría para desalar la noche anterior. ");
		instruccionesDeElaboracion.add("Paso 3: Se escurren los garbanzos y se ponen en una malla pero sin llenarla, por lo que crecen, para que no se mezcle con el resto de los condimentos. ");
		instruccionesDeElaboracion.add("Paso 4: Se limpian los grelos y se trocean y se ponen en una cacerola con hueso de caña, aceite y sal. ");
		instruccionesDeElaboracion.add("Paso 5: Cuando estén tiernos se retiran del fuego y se escurren y se reservan. ");
		instruccionesDeElaboracion.add("Paso 6: En una cacerola se pone la falda de ternera, el tocino, la careta, el jamón y el chorizo a fuego lento. ");
		instruccionesDeElaboracion.add("Paso 7: Cuando estén casi cocidos, la carne y los garbanzos, se les agrega las patatas enteras y los grelos. ");
		instruccionesDeElaboracion.add("Paso 8: Se deja cocer hasta que todo esté tierno y se sirven en una bandeja sin mezclar los ingredientes.");
		poteGallego.setInstruccionesDeElaboracion(instruccionesDeElaboracion);
		poteGallego.setMinPreparacion(180);
		poteGallego.setNumeroDePersonas(8);
		tipoPrep = new LinkedList<>();
		tipoPrep.add("Dejar en remojo");
		tipoPrep.add("Desalar");
		tipoPrep.add("Escurrir");
		tipoPrep.add("Cocinar a fuego lento");
		tipoPrep.add("Trocear");
		poteGallego.setTipoDePreparacion(tipoPrep);
		poteGallego.setCantidadCalorias("Media");
		poteGallego.setNacionalidad("Gallega");
		recetas = new LinkedList<>();

		// Añadir todas las recetas a la lista
		recetas.add(cochinilloAsado);
		recetas.add(poteGallego);

		keywords = new HashMap<>();

		// Lista de palabras clave de cada pregunta tipo
		List<String> keywordList = new LinkedList<>();
		keywordList.add("disponibles");
		keywordList.add("nombre");
		keywordList.add("recetas");
		keywordList.add("hay");
		keywords.put(FRASE_NOMBRE,keywordList);

		// Palabras clave de FRASE_INGREDIENTES
		keywordList = new LinkedList<>();
		keywordList.add("ingredientes");
		keywordList.add("ingrediente");
		keywordList.add("lista");
		keywordList.add("cuales");
		keywordList.add("especias");
		keywordList.add("anadir");
		keywordList.add("necesito");
		keywords.put(FRASE_INGREDIENTES,keywordList);

		// Palabras clave de FRASE_CANTIDADES
		keywordList = new LinkedList<>();
		keywordList.add("cuantos ingredientes");
		keywordList.add("ingredientes");
		keywordList.add("ingrediente");
		keywordList.add("cantidad");
		keywordList.add("cantidades");
		keywordList.add("cuanto");
		keywordList.add("necesito");
		keywords.put(FRASE_CANTIDADES,keywordList);

		// Palabras clave de FRASE_ORIGEN
		keywordList = new LinkedList<>();
		keywordList.add("de donde");
		keywordList.add("sitio");
		keywordList.add("lugar");
		keywordList.add("region");
		keywordList.add("pais");
		keywordList.add("origen");
		keywordList.add("originario");
		keywordList.add("procedencia");
		keywordList.add("procede");
		keywordList.add("viene");
		keywords.put(FRASE_ORIGEN,keywordList);

		// Palabras clave de FRASE_DIFICULTAD
		keywordList = new LinkedList<>();
		keywordList.add("dificil");
		keywordList.add("facil");
		keywordList.add("dificultad");
		keywordList.add("cuanto cuesta");
		keywordList.add("hacer");
		keywords.put(FRASE_DIFICULTAD,keywordList);

		// Palabras clave de FRASE_TIEMPO
		keywordList = new LinkedList<>();
		keywordList.add("tiempo");
		keywordList.add("tarda");
		keywordList.add("tardar");
		keywordList.add("tardar en hacer");
		keywordList.add("tarda en hacer");
		keywordList.add("cuanto");
		keywordList.add("tiempo de preparacion");
		keywords.put(FRASE_TIEMPO,keywordList);

		// Palabras clave de FRASE_CALORIAS
		keywordList = new LinkedList<>();
		keywordList.add("calorias");
		keywordList.add("nivel");
		keywordList.add("calorico");
		keywordList.add("dieta");
		keywordList.add("caloria");
		keywordList.add("cuantas calorias");
		keywords.put(FRASE_CALORIAS,keywordList);

		// Palabras clave de FRASE_VEGETARIANA
		keywordList = new LinkedList<>();
		keywordList.add("vegetariano");
		keywordList.add("vegano");
		keywordList.add("verdura");
		keywordList.add("vegetal");
		keywordList.add("apto para vegetarianos");
		keywordList.add("vegetarianos");
		keywordList.add("vegetariana");
		keywordList.add("receta vegetariana");
		keywordList.add("plato vegetariano");
		keywords.put(FRASE_VEGETARIANA,keywordList);

		// Palabras clave de FRASE_HERRAMIENTAS
		keywordList = new LinkedList<>();
		keywordList.add("instrumentos");
		keywordList.add("materiales");
		keywordList.add("utensilios");
		keywordList.add("herramientas");
		keywordList.add("de cocina");
		keywordList.add("recipiente");
		keywordList.add("cubierto");
		keywordList.add("necesito");
		keywords.put(FRASE_HERRAMIENTAS,keywordList);

		// Palabras clave de FRASE_METODOS
		keywordList = new LinkedList<>();
		keywordList.add("metodos");
		keywordList.add("técnicas");
		keywordList.add("cocinado");
		keywordList.add("culinario");
		keywordList.add("culinaria");
		keywordList.add("culinarios");
		keywordList.add("culinarias");
		keywordList.add("empleado");
		keywordList.add("empleados");
		keywordList.add("empleada");
		keywordList.add("empleadas");
		keywordList.add("cocinado");
		keywordList.add("cocinar");
		keywords.put(FRASE_METODOS,keywordList);

		// Palabras clave de FRASE_INSTRUCCIONES
		keywordList = new LinkedList<>();
		keywordList.add("como se hace");
		keywordList.add("como se prepara");
		keywordList.add("como se cocina");
		keywordList.add("puedo");
		keywordList.add("puede");
		keywordList.add("poder");
		keywordList.add("pasos");
		keywordList.add("receta");
		keywordList.add("seguir");
		keywordList.add("lista");
		keywordList.add("hacer");
		keywordList.add("hago");
		keywordList.add("cocinar");
		keywords.put(FRASE_INSTRUCCIONES,keywordList);

		// Palabras clave de FRASE_PERSONAS
		keywordList = new LinkedList<>();
		keywordList.add("persona");
		keywordList.add("personas");
		keywordList.add("cuantas personas");
		keywordList.add("para cuantos");
		keywords.put(FRASE_PERSONAS,keywordList);

		// Inicialización del escáner y las variables donde se almacenarán los datos de la pregunta escaneada
		Scanner scanner = new Scanner(System.in);
		String query;
		String modelQuery;
		String answer;
		String x;
		String r="";
		System.out.println("Introduzca una pregunta sobre alguna receta disponible o escriba 'Salir' para cerrar el programa.");
		for (Receta rec : recetas) { r += rec.getNombre() + ", "; }
		r = r.substring(0, r.length()-2);
		System.out.println("Recetas disponibles: "+r);
		System.out.println();
		
		while(!(query = scanner.nextLine()).equals("Salir")) {

			// Escaneo de la pregunta del usuario
			//Parafraseo
			String cadenaNormalize = Normalizer.normalize(query.toLowerCase().trim().replaceAll("\\?", "").replaceAll("¿", ""), Normalizer.Form.NFD);   
			query = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

			modelQuery = getFraseTipo(query);
			x = getRecetaQuery(query);
			answer = "";
			//Enlace de las preguntas tipo con los datos
			Receta receta = getReceta(x);
			// Cada caso busca los datos correspondientes dependiendo de cada receta y los saca por pantalla con una frase predeterminada
			if(receta!=null || (receta == null && modelQuery == FRASE_NOMBRE)) {
				switch(modelQuery) {
					case FRASE_NOMBRE:
						for (Receta rec : recetas) {
							answer += rec.getNombre() + ", ";
						}
				 		answer = answer.substring(0, answer.length()-2); break;
				 		
				 	case FRASE_INGREDIENTES:
				 		for (Ingrediente ingrediente : receta.getIngredientes()) {
				 			answer += ingrediente.getNombre() + "\n";
						}
				 		break;
				 		
				 	case FRASE_CANTIDADES:
				 		for (Ingrediente ingrediente : receta.getIngredientes()) {
				 			answer += ingrediente.getCantidad() + " " + ingrediente.getUnidadDeMedida() + " de " + ingrediente.getNombre() + "\n";
						}
				 		break;
				 		
				 	case FRASE_ORIGEN:
				 		answer = "Es: " + receta.getNacionalidad(); break;
				 		
					case FRASE_DIFICULTAD:
						answer = "Dificultad: " + receta.getDificultad(); break;
					 	
					case FRASE_TIEMPO:
						answer = "Tiempo de preparación: " + receta.getMinPreparacion() + " minutos."; break;
						
					case FRASE_CALORIAS:
						answer = "Canitad de calorías: " + receta.getCantidadCalorias(); break;
						
					case FRASE_VEGETARIANA:
						if(receta.isEsVegetariano())
							answer = "Es un plato vegetariano"; 
						else
							answer = "No es un plato vegetariano";
						break;
					
					case FRASE_HERRAMIENTAS:
				 		for (String herramienta : receta.getHerramientasDeCocina()) {
				 			answer += herramienta + "\n";
						}
				 		break;
					
					case FRASE_METODOS:
				 		for (String metodo : receta.getTipoDePreparacion()) {
				 			answer += metodo + ", ";
						}
				 		answer = answer.substring(0, answer.length()-2); break;
						
					case FRASE_INSTRUCCIONES:
				 		for (String instruccion : receta.getInstruccionesDeElaboracion()) {
				 			answer += instruccion + "\n";
						}
				 		break;
						
					case FRASE_PERSONAS:
						answer = "Para " + receta.getNumeroDePersonas() + " personas"; break;	
						
				 	default:
				 		answer = "No se ha encontrado una respuesta, por favor reformula la pregunta."; break;
				}
			}
			else {
				answer = "No se ha encontrado una respuesta, por favor reformula la pregunta.";
			}
			// El único menú disponible es el escribir una pregunta o escribir la palabra "salir" para cerrar el programa
			System.out.println(answer);
			System.out.println();
			System.out.println("Introduzca una pregunta o escriba 'Salir' para cerrar el programa.");
			System.out.println();
		}
		scanner.close();
		System.exit(0);
	}

	// Compara la frase obtenida mediante el escaneo con la frase tipo y devuelve aquella que más se parezca
	private static String getFraseTipo(String query) {
		String res = "";
		int maxVal = 0;
		// Contador de coincidencias
		int counter = 0;
		// Se devuelve aquella frase que más coincidencias tenga
		for(String fraseTipo : keywords.keySet()) {
			counter = 0;
			for(String palabraAComprobar : keywords.get(fraseTipo)) {
				if(query.contains(palabraAComprobar)) {
					counter++;
				}
			}
			if(counter>maxVal && counter != 0) {
				res = fraseTipo;
				maxVal = counter;
			}
		}
		return res;
	}

	// Comprueba y devuelve el nombre de la receta incluida en la pregunta
	private static String getRecetaQuery(String query) {
		if (query.contains("pote gallego") || query.contains("pote"))
			return "pote gallego";
		else if (query.contains("cochinillo asado") || query.contains("cochinillo"))
			return "cochinillo asado";
		else
			return "";
	}

	// Devuelve la receta a la que pertenece el nombre incluido en la pregunta realizada por el usuario
	private static Receta getReceta(String nombre) {
		for (Receta receta : recetas) {
			if(receta.getNombre().toLowerCase().equals(nombre))
				return receta;
		}
		return null;
	}
}
