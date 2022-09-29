package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented: ");
        int n = key.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ": ");
            System.out.print("Name: ");
            key.nextLine();
            String name = key.nextLine();
            System.out.print("Email: ");
            String email = key.nextLine();
            System.out.print("Room: ");
            int room = key.nextInt();

            rooms[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }

        }

    }
}
