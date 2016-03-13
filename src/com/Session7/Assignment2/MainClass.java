package com.Session7.Assignment2;

public class MainClass {

	/*
	 * Handle NumberFormat Exception. For example the statement int num=Integer.parseInt ("XYZ");
	 * would throw NumberFormatException because String ‰ÛÏXYZ‰Û¥ cannot be parsed to int. So
	 * handle it
	 */
	
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt ("XYZ");
		} catch (NumberFormatException e) {
			System.out.println("i is a integer number so please enter an integer number for this");
		}
	}
}
