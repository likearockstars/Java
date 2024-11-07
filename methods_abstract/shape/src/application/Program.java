package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int quantityOfObjects = sc.nextInt();
		
		for(int i = 0; i < quantityOfObjects; i++) {
			
			System.out.println("Shape #" + (i+1) +  " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(answer == 'r') {
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Rectangle rectangle = new Rectangle(width,height,color);
				shapes.add(rectangle);
				
			}else {
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Circle cirle = new Circle(color,radius);
				shapes.add(cirle);
			}
			
			System.out.println();
		}
		
		System.out.println("SHAPE AREAS:");
		showArea(shapes);
		
		
		sc.close();
		                                
	}
	
	public static void showArea(List<Shape> shapes) {
		
		
		for(Shape shape : shapes) {
			
			System.out.printf("%.2f\n",shape.area());
		}
	}

}
