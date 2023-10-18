package com.mycompany.mavenproject1;
import java.util.*;
public class Mavenproject1 {

    public static void main(String[] args) {
        Editora e1 = new Editora("Edt 1", "edt1@email.com");
        Editora e2 = new Editora("Edt 2", "edt2@email.com");
        
        Autor a1 = new Autor("renato", "ai1");
        Autor a2 = new Autor("renato2", "ai2");
        
        Livro l1 = new Livro("l1", 2023, e1);
        Livro l2 = new Livro("l2", 2001, e2);
        
        a1.AdicionarContato("celular", "27995737630");
        a2.AdicionarContato("celular", "27995737630");      
    }
}
