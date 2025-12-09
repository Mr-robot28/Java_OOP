package com.constructor;

public class RectanglePara {

	 int length;
	    int width;

	    RectanglePara(int l, int w) {
	        length = l;
	        width = w;
	    }

	    void area() {
	        System.out.println("Area : " + (length * width));
	    }
}
