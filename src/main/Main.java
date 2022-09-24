package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import model.Queue;

public class Main {

	private static Main main;
	private static Scanner scanner;
	
	public Main() {
		scanner = new Scanner(System.in);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setMain(new Main());
		Main.menu();	
	}
	
	private static void setMain(Main main) {
		// TODO Auto-generated method stub
		Main.main= main;
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Digite la cadena");
		String line = scanner.nextLine();
		ArrayList<String> division = new ArrayList<String>(Arrays.asList(line.split(",")));
		Queue queue= new Queue(division.size());
		for(int i =0 ; i<division.size(); i++ ) {
			queue.enqueue(division.get(i));	
			System.out.println(queue.front());
		}System.out.println("_____________");
		for(int i=0;i< division.size(); i++) {
			System.out.println(queue.front());
			queue.dequeue();
					
		}
	}

}
