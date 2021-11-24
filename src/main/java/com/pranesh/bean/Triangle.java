package com.pranesh.bean;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
	
	
	private String type;
	private int height;

	
	private Point pointA;
	private List<Point> points;	
	
	
	public Triangle() {
		
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void print() {
		System.out.println("Triangle: " + type);
		System.out.println("Height: " + height);
//		System.out.println("Point A = " + pointA.getCoordinates());
		
//		for(Point point:points) {
//			System.out.println("Points "+point.getCoordinates());
//		}
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("setApplicationContext" + applicationContext);
	}

	public void setBeanName(String name) {
		System.out.println("setBeanName: " + name);
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("triangle bean initialized");
		
	}

	public void destroy() throws Exception {
		System.out.println("triangle bean destroyed");
		
	}
	
	public void myInit() {
		System.out.println("myinit");
	}
}
