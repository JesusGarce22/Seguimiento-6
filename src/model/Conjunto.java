package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjunto<T> implements operacionesConjunto<T>{
	
	public static Scanner sn=new Scanner(System.in);
	
	private T[] sett;
	
	
	public Conjunto(T[] conjunto) {
		this.sett=conjunto;
	}
	
	@Override
	public void crearConjunto() {
		System.out.println("How many elements has the set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			sett[i]= (T) sn.nextLine();
		}

		setA.addAll(Arrays.asList(sett));
		
	}

	@Override
	public void union() {
		// TODO Auto-generated method stub
		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			sett[i]= (T) sn.nextLine();
		}

		setA.addAll(Arrays.asList(sett));
		

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		
		Set<T> setB = new HashSet<>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			sett[i]=(T) sn.nextLine();
		}

		setB.addAll(Arrays.asList(sett));

		Set<T> setUnion = new HashSet<>(setA);
		setUnion.addAll (setB);

		System.out.println("Union of A and B" );
		System.out.println( setUnion );

		
	}

	@Override
	public void interseccion() {
		// TODO Auto-generated method stub
		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			sett[i]= (T) sn.nextLine();
		}

		setA.addAll(Arrays.asList(sett));
		

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		
		Set<T> setB = new HashSet<>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			sett[i]=(T) sn.nextLine();
		}

		setB.addAll(Arrays.asList(sett));

		Set<T> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);

		System.out.println("intersection of A and B" );
		System.out.println( intersection );
	}

	@Override
	public void diferencia() {
		// TODO Auto-generated method stub
		System.out.println("How many elements has the first set?");
		int cant1=sn.nextInt();
		sn.nextLine();

		
		Set<T> setA = new HashSet<T>() ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant1;i++) {
			sett[i]= (T) sn.nextLine();
		}

		setA.addAll(Arrays.asList(sett));
		

		System.out.println("How many elements has the second set?");
		int cant2=sn.nextInt();
		sn.nextLine();

		
		Set<T> setB = new HashSet<>( ) ;

		System.out.println("Enter the elements for create the set");

		for(int i=0;i<cant2;i++) {
			sett[i]=(T) sn.nextLine();
		}

		setB.addAll(Arrays.asList(sett));

		Set<T> symmetricalDifference = new HashSet<>(setA);
		symmetricalDifference.removeAll(setB);

		System.out.println("Symmetrical Difference of A and B" );
		System.out.println( symmetricalDifference );
	}


}
