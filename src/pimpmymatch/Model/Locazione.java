/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pimpmymatch.Model;

import java.util.ArrayList;

/**
 *
 * @author akerbabber
 */ 
//Le locazioni identificano il luogo fisico dove si svolge il match e i contatti per contattare il gestore del campo,
// vengono aggiunte e modificatedall admin 
public class Locazione {
    public String nomeLocazione;
    public String indirizzo;
    public ArrayList<String> listaContatti;
    
}
