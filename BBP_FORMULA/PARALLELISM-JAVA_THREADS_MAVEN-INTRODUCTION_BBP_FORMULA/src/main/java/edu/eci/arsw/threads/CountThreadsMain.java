/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread p = new CountThread(0,99);
        CountThread s = new CountThread(100,199);
        CountThread t = new CountThread(200,299);
        p.start();
        s.start();
        t.start();
    }
    
}
