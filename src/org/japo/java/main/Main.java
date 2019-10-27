/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;



/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {


    public static void main(String[] args) {

        //CONSTANTES
        String PERSONA_CON_OREJAS = "Jaimito";
        String ARTICULO_ENCARGADO = "Patatas";
        String ARTICULO_SORPRESA = "Piruleta";
        double DINERITO_MAMA = 1.00;
        int CANTIDAD_ENCARGADA = 3;
        double PRECIO_POTATOES = 0.30;
        double PIRULETA = 0.20;
        
        //Variables
        double devolucion = DINERITO_MAMA - PIRULETA;
        int compraKilos = (int) ((devolucion * 100) / (PRECIO_POTATOES * 100));
        double dineroDevuelto = devolucion- compraKilos * PRECIO_POTATOES  ;
        
            

        //ROTULO
        System.out.printf("Secuendia de Patatas %n==================== %n");
        System.out.printf("Persona encargada .....: %s%n", PERSONA_CON_OREJAS);
        System.out.printf("Artículo encargado ....: %s%n", ARTICULO_ENCARGADO);
        System.out.printf("Cantidad encargada %d kg%n---%n " ,CANTIDAD_ENCARGADA);
        System.out.printf(Locale.ENGLISH,"Precio encargo ........: %.2f €/kg%n", PRECIO_POTATOES);
        System.out.printf(Locale.ENGLISH,"Dinerito Suministrado %.2f €%n---%n", DINERITO_MAMA);
        System.out.printf("Artículo imprevisto ...: %s%n", ARTICULO_SORPRESA);
        System.out.printf(Locale.ENGLISH,"Precio imprevisto .....: %.2f %n---%n€", PIRULETA);
        System.out.printf("Cantidad comprada .....: %d kg%n",compraKilos);
        System.out.printf(Locale.ENGLISH,"Dinero devuelto .......: %.2f €%n", dineroDevuelto);
        
        
        

      
       
        
        }
    }

