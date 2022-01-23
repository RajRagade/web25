package javalab2data;

import java.util.Scanner;

public class maindata {

	public static void main(String[] args) {

		meargsort mergeSortImplementation = new meargsort();
		notecount notesCount = new notecount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notecount(notes, amount);
	}
}


