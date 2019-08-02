/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author sri erra
 */
import java.util.Scanner;
import java.io.*;

public class SingleLinkedList {
   Node head; //variabel global (head) untuk node list pertama 
    
   static int sum=0; 
   
    static class Node { 
        int data; 
        Node next; 
          // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
      // **************INSERTION************** 
      // membuat method untuk menambah data
    public static SingleLinkedList insert(SingleLinkedList list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    } 
      // **************TRAVERSAL************** 
      // Method untuk menampilkan (Print) data
    public static void printList(SingleLinkedList list) 
    { 
        Node currNode = list.head; 
          System.out.print("\nLinkedList: "); 
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.println("\n"); 
    } 
      // **************DELETION BY KEY************** 
      // Method untuk menghapus data (angka) berdasarkan angka nya (yang dimasukkan)
    public static SingleLinkedList deleteByKey(SingleLinkedList list, int key) 
    { 
        Node currNode = list.head, prev = null; 
          if (currNode != null && currNode.data == key) { 
            list.head = currNode.next;
            System.out.println(key + " found and deleted"); 
            return list; 
        } 
        while (currNode != null && currNode.data != key) { 
            prev = currNode; 
            currNode = currNode.next; 
        } 
        if (currNode != null) { 
            prev.next = currNode.next; 
            System.out.println(key + " found and deleted"); 
        } 
        if (currNode == null) { 
            System.out.println(key + " not found"); 
        } 
        return list; 
    } 
      // **************DELETION AT A POSITION************** 
      // Method untuk menghapus posisi berdasarkan posisi si angka
    public static SingleLinkedList deleteAtPosition(SingleLinkedList list, int index) 
    { 
        Node currNode = list.head, prev = null; 
          if (index == 0 && currNode != null) { 
            list.head = currNode.next; 
            System.out.println(index + " position element deleted"); 
            return list; 
        } 
        int counter = 1; 
        while (currNode != null) { 
              if (counter == index) { 
                prev.next = currNode.next; 
                System.out.println(index + " position element deleted"); 
                break; 
            } 
            else { 
                prev = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
        } 
        if (currNode == null) { 
            System.out.println(index + " position element not found"); 
        } 
        return list; 
    }
    
    
    
      // **************MAIN METHOD************** 
      // Method yang bisa mengakses semua class method
    public static void main(String[] args) 
    { 
        SingleLinkedList list = new SingleLinkedList();
        Node head = null;
        Scanner sn = new Scanner(System.in);
        
            System.out.println("Masukkan angka sebanyak 5 kali (jangan lupa di enter dahulu)");
            //memasukkan angka agar sampai 5X
            //proses menyusun angkanya
            for(int i=1; i<=5; i++){
                int a = sn.nextInt();
                //insert node
                list = insert(list, a);
            }
            printList(list);
            
            //delete angka dengan angka yang ada
            System.out.println("Delete angka by Key (Angka yang tertera diatas) ");
            int b = sn.nextInt();
            list = deleteByKey(list, b);
            printList(list);
            
            //delete angka sesuai dengan urutan angkanya
            System.out.println("Delete angka by Position (1/2/3/4) ");
            int c = sn.nextInt();
            list = deleteAtPosition(list, c);
            printList(list);
        
    } 
}