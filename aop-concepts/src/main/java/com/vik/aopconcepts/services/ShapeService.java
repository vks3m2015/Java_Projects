package com.vik.aopconcepts.services;

import com.vik.aopconcepts.models.Circle;
import com.vik.aopconcepts.models.Triangles;

public class ShapeService {

	private Triangles triangle;
	private Circle circle;
	
	public Triangles getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangles triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
	
}
