/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        System.out.println(Calcular_peso_carga(47.5f,7.5f ));
      
    }

    /* 
    2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
    y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
    devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidad_km_seg) {
        try {
            //Inicializamos las variables
            float velocidad_m_seg = 0;
            float velocidad_m_hora = 0;

            //Declaramos las constantes
            final int KM_M = 1000;
            final int SEG_HORA = 3600;

            //Convertimos km/seg a m/seg multiplicando por 1000
            velocidad_m_seg = (velocidad_km_seg * KM_M);
                
            //Convertimos m/h a km/seg multiplicando por 3600
            velocidad_m_hora = (velocidad_m_seg * SEG_HORA);
        
            //Return
            return velocidad_m_seg + " m/s - " + velocidad_m_hora + " m/h";
            } 
            
        catch (Exception e) {
            return "Error en la conversion";
            }
    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt (double cantidad_cc){
        try {
            //Inicializamos las variables 
            float cantidad_litros = 0;
            
            //Declaramos las constantes
            final int CC_L = 1000;

            //Convertimos la cantidad de centímetros cúbicos a litros dividiendo por 1000
            cantidad_litros = (float)(cantidad_cc/CC_L);

            //Return 
            return cantidad_litros;
            } 

        catch (Exception e) {
            return 0;
            }
    }

    /*4.Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
    y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
    y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
    */
    public static long Convertir_us_cops (long cantidad_dolares){
        try {
            //Inicializamos las variables 
            long cantidad_pesos = 0;

            //Declaramos las constantes
            final int TRM = 4170;

            //Convertipos los US a COP multiplicando por la tasa de cambio
            cantidad_pesos = (cantidad_dolares * TRM);

            //RETURN
            return cantidad_pesos;
            } 

        catch (Exception e) {
            return -1;
            }
    }
  
    /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
    centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
    retorne 0.
    */
    public static float Convertir_cent_far (float temperatura_centigrados){
        try {
           //Inicializamos las variables 
           float temperatura_fahrenheit = 0;
        
           //Declaramos constantes 
           final int FACTOR_FORMULA = (9/5);
           final int SUMA_FORMULA = 32;

           //Convertimos la temperatura de grados a centígrados siguiendo la fórmula F = 32 + ( 9 * C / 5)
           temperatura_fahrenheit = (temperatura_centigrados * FACTOR_FORMULA) + SUMA_FORMULA;

           //Return 
           return temperatura_fahrenheit;
           }

        catch (Exception e) {
           return 0;
           }
    }

    /*6.Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
    el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
    Si hay algún error, devuelva -1.
    */
    //No me permite ejecutar el test de este ejercicio, sin embargo el resultado es el mismo 
    public static int Calcular_segs (byte días, byte horas, byte minutos, byte segundos){
        try {
           //Inicializamos variables 
           int cantidad_final_segundos = 0;
           int cantidad_día_segundo = 0;
           int cantidad_hora_segundo = 0;
           int cantidad_min_segundo = 0;
   
           //Declaramos constante
           final int DIA_SEG = 86400;
           final int HORA_SEG = 3600;
           final int MIN_SEG = 60;

           //Hacemos las conversiones correspondientes para día, hora y minuto a segundo
           cantidad_día_segundo = (días * DIA_SEG);
           cantidad_hora_segundo = (horas * HORA_SEG);
           cantidad_min_segundo = (minutos * MIN_SEG);
        
           //Calculamos el total en segundos, añadimos un condicional para que los bytes sean positivos
           if(días>0 && horas>0 && minutos>0 && segundos>0){
           cantidad_final_segundos=(cantidad_día_segundo + cantidad_hora_segundo + cantidad_min_segundo + segundos);
           }

           //Return
           return cantidad_final_segundos;
           }

        catch (Exception e) {
           return -1;
           }
    }
   
    /*7.Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
    Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
    lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
    en un string del tipo: "### kilos - ### toneladas". 
    Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

    public static String Calcular_peso_carga (float peso_total, float peso_camión_vacío){
        try {
            // Inicializamos variables 
            float peso_neto_toneladas = 0;
            float peso_neto_kg = 0;

            // Declaramos constantes 
            final int TONELADA_KG = 1000;

            //Hallamos el peso neto en toneladas restando el peso total al del camión vacío y después lo convertimos a kilogramos
            peso_neto_toneladas = (peso_total - peso_camión_vacío);
            peso_neto_kg = (peso_neto_toneladas * TONELADA_KG);

            //Return
            return peso_neto_kg + " kilos - "+ peso_neto_toneladas +" toneladas";
            }

        catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
            }
    }

    /*8Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
    necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en km
    otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
    Si hay algún error, devuelva -1.
    */
    public static float Calcular_horasxviaje (String destino, short distancia, short velocidad_promedio){
        try {
            //inicializamos variables 
            float horas_viaje = 0;

            //Hacemos las operaciones correspondientes 
            horas_viaje = (float)(distancia / velocidad_promedio);

            //Return
            return horas_viaje;
            } 

        catch (Exception e) {
            return -1;
            }
    }
  
    /*9.Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
    Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
    En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
    El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
    el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
    de combustible que debe ser cargado en el avión.
   
    Si hay algún error, devuelva -1.*/
    public static float Calcular_combustible (int ruta_1, int ruta_2, int ruta_3, int ruta_4){
        try {
            //Inicializamos las variables 
            float combustible_a_cargar = 0;
            float toneladas_despeje_aterrizaje = 0;

            //Declaramos las constantes 
            final float toneladas_despegue = (float)1.2;
            final float toneladas_aterrizaje = (float)0.4;
            final float gasto = (float)(0.2 / 60.8);           
   
            //Calculamos por el gasto por el despegue y el aterrizaje por las 4 rutas
            toneladas_despeje_aterrizaje = (toneladas_aterrizaje + toneladas_despegue)*4;
            //calculamos el combustible a cargar teniendo en cuenta todas las rutas
            combustible_a_cargar = (ruta_1 * gasto) + (ruta_2 * gasto) + (ruta_3 * gasto) + ( ruta_4 * gasto) + (toneladas_despeje_aterrizaje);

            //Return 
            return combustible_a_cargar;    
            }

        catch (Exception e) {
            return -1;
            }
    }


    /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
    y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
    peso_tierra_new = peso_kilos * 9.81m/s2
    peso_luna_new = peso_tierra_new * 0.165
   
    Si hay algún error, devuelva 0.
     */
    public static double  Calcular_peso_luna(byte peso_tierra_k) {
        try {
            // Declaramos las constantes
            final float gravedad_tierra = 9.81f; 
            final float conversion_luna = 0.165f;

            // Calculamos el peso en la tierra
            double peso_tierra_final = (peso_tierra_k * gravedad_tierra);

            // Calculamos el peso en la luna
            double peso_luna = (peso_tierra_final * conversion_luna);

            //Return
            return peso_luna;
            }

        catch (Exception e) {
            return 0;
            }
    }
   
}
